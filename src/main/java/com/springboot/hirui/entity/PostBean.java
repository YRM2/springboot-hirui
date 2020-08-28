package com.springboot.hirui.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author RM
 *
 */
@Getter
@Setter
@ToString
public class PostBean {

	private int userId;
    private int id;
    private String title;
    private String body;
}
