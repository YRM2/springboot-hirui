package com.springboot.hirui.util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

/**
 * WebClient基础封装<Br>
 * 封装了常用的WebClient方法
 * @author RM
 *
 */
public class WebClientUtil {

	private static final Logger log = LoggerFactory.getLogger(WebClientUtil.class);
	
	private static final HttpClient httpClient = HttpClient.create()
	        .tcpConfiguration(client ->
	        		//连接超时时间
	                client.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000)
	                      .doOnConnected(conn -> conn
	                    		  //读超时时间
	                              .addHandlerLast(new ReadTimeoutHandler(10, TimeUnit.SECONDS))
	                              //写超时时间
	                              .addHandlerLast(new WriteTimeoutHandler(10, TimeUnit.SECONDS))));
	
	public static WebClient webclient = WebClient.builder()
			.clientConnector(new ReactorClientHttpConnector(httpClient))
			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON.getType())
			.filter(logRequest())
			.filter(logResponse())
			.build();
	
	private static ExchangeFilterFunction logRequest() {
		return ExchangeFilterFunction.ofRequestProcessor(clientRequest -> {
			StringBuilder headers_sb = new StringBuilder();
			clientRequest.headers().forEach((name, values) -> {
				values.forEach(value -> headers_sb.append(name).append("=").append(value).append(" "));
			});
			log.info("Request: method={} url={} body={} headers= {}", clientRequest.method(), clientRequest.url(),
					clientRequest.body(), headers_sb);
			return Mono.just(clientRequest);
		});
	}
	
	private static ExchangeFilterFunction logResponse() {
		return ExchangeFilterFunction.ofResponseProcessor(clientResponse -> {
			log.info("Response: {}", clientResponse.statusCode());
			return Mono.just(clientResponse);
		});
	}
	
	/**
	 * GET 方法（同步调用）
	 * @param url
	 * @param c
	 * @return 返回0-1个传入类型对象
	 * @throws WebClientResponseException
	 */
	public static <T> T getWithMono(String url, Class<T> c) {
		Mono<T> result = webclient.get()
		        .uri(url).accept(MediaType.APPLICATION_JSON)
		        .retrieve()
		        .bodyToMono(c);
		return result.block();
	}
	
	/**
	 * GET 方法 （同步调用）
	 * @param url
	 * @param c
	 * @return 返回0-N个传入类型对象
	 */
	public static <T> List<T> getWithFlux(String url, Class<T> c) {
		Flux<T> result = webclient.get()
				.uri(url)
				.retrieve()
				.bodyToFlux(c);
		return result.collectList().block();
	}
	
	/**
	 * POST 方法（同步调用）
	 * @param url  全路径
	 * @param body 
	 * @param c
	 * @return
	 */
	public static <T> T post(String url, T body, Class<T> c) {
		Mono<T> result = webclient.post()
				.uri(url)
				.body(BodyInserters.fromValue(body))
				.retrieve()
				.bodyToMono(c);
		return result.block();
	}
	
	/**
	 * PUT 方法 （同步调用）
	 * @param url 全路径
	 * @param c
	 * @return
	 */
	public static <T> T put(String url, T body, Class<T> c) {
		Mono<T> result = webclient.put()
				.uri(url)
				.body(BodyInserters.fromValue(body))
				.retrieve()
				.bodyToMono(c);
		return result.block();
	}
	
	/**
	 * DELETE 方法（同步调用）
	 * @param url 全路径
	 * @param c
	 * @return
	 */
	public static <T> T delete(String url, Class<T> c) {
		Mono<T> result = webclient.delete()
				.uri(url)
				.retrieve()
				.bodyToMono(c);
		return result.block();
	}
}
