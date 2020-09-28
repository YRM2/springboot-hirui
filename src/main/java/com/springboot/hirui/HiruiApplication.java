package com.springboot.hirui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动类<Br>
 * ServletComponentScan注解扫描 只在使用嵌入式web服务器时执行. 
 * @author RM
 *
 */
@SpringBootApplication
@ServletComponentScan
public class HiruiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiruiApplication.class, args);
	}

}
