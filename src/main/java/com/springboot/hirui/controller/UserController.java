package com.springboot.hirui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hirui.entity.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 
 * @author RM
 *
 */
@RestController
@Api(tags = "用户数据接口")
public class UserController {

    @ApiOperation(value ="查询用户", notes = "根据 id 查询用户")
    @ApiImplicitParam(paramType = "path", name = "id", value = "用户 id", required = true)
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable Integer id){
        return "查找的用户id是：" + id;
    }
 
    @ApiOperation(value = "新增用户", notes = "根据传入的用户名和密码添加一个新用户")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "username",
                    value = "用户名", required = true, defaultValue = "test"),
            @ApiImplicitParam(paramType = "query", name = "password",
                    value = "密码", required = true, defaultValue = "123")
    })
    @PostMapping("/user")
    public String addUser(@RequestParam String username, @RequestParam String password) {
        return "新增用户：" + username + " " + password;
    }
 
    @ApiOperation(value = "删除用户", notes = "根据 id 删除用户")
    @ApiResponses({
            @ApiResponse(code = 200, message = "删除成功！"),
            @ApiResponse(code = 500, message = "删除失败！")
    })
    @DeleteMapping("/user/{id}")
    public Integer deleteUserById(@PathVariable Integer id) {
        return id;
    }
 
    @ApiOperation(value = "修改用户", notes = "传入用户信息进行更新修改")
    @PutMapping("/user")
    public String updateUser(@RequestBody User user){
        return user.toString();
    }
 
    @ApiIgnore
    @GetMapping("/user/test")
    public String test() {
        return "这是一个测试接口，不需要在api文档中显示。";
    }
}
