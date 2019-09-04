package com.jack.hrmanagement.Controller;

import com.jack.hrmanagement.Common.RequestResult;
import com.jack.hrmanagement.Model.User;
import com.jack.hrmanagement.Service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private UserService userService;

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

    @ApiOperation("搜索用户")
    @RequestMapping(value = "searchUserByUsername", method = RequestMethod.POST)
    @ResponseBody
    public RequestResult searchUserByUsername(@Valid @RequestBody String username) {

        User searchUser = userService.selectUserByName(username);
        RequestResult data = RequestResult.success(searchUser);
        return data;
    }

    @ApiOperation("删除用户")
    @RequestMapping(value = "deleteUser", method = RequestMethod.POST)
    @ResponseBody
    public RequestResult deleteUserByUserID(@Valid @RequestBody String userID) {

        User searchUser = userService.selectUserByName(userID);
        RequestResult data = RequestResult.success(searchUser);
        return data;
    }

}
