package com.jack.hrmanagement.Controller;

import com.jack.hrmanagement.Common.RequestResult;
import com.jack.hrmanagement.Model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;


@Controller
@Api(tags = "user", description = "用户相关")
@RequestMapping("/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @ApiOperation("用户登录")
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public RequestResult userLogin(@Valid @RequestBody User user, BindingResult result) {

        if (result.hasErrors()) {
            for (ObjectError error : result.getAllErrors()) {
                return RequestResult.parameterError(error.getDefaultMessage());
            }
        }

        logger.info("user login calls");
        RequestResult data = RequestResult.success("欢迎：" + user.getUsername());
        return data;
    }


    @ApiOperation("用户注册")
    @RequestMapping(value = "register", method = RequestMethod.POST)
    @ResponseBody
    public RequestResult userRegister(@Valid @RequestBody User user) {

        logger.info("user login calls");
        RequestResult data = RequestResult.success("hihi");
        return data;
    }
}
