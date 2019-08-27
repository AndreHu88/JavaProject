package com.jack.hrmanagement.Model;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class User {

    @ApiModelProperty(value = "用户名")
    @NotEmpty(message = "用户名不能为空")
    String username;

    @ApiModelProperty(value = "密码")
    @NotEmpty(message = "密码不能为空")
    String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
