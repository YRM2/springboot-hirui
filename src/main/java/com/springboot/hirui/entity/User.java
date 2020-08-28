package com.springboot.hirui.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author RM
 *
 */
@Setter
@Getter
@NoArgsConstructor
@ToString
@ApiModel(value = "用户实体类", description = "用户信息描述类")
public class User {
	
	@ApiModelProperty(value = "用户id")
	private Integer id;
	
	@ApiModelProperty(value = "用户名")
	private String userName;
	
	@ApiModelProperty(value = "用户密码")
	private String passWord;
}
