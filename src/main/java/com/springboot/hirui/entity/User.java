package com.springboot.hirui.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class User {
	
	private Integer id;
	
	private String userName;
	
	private String passWord;
}
