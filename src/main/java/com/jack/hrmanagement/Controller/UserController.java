package com.jack.hrmanagement.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UserController {


    @RequestMapping(value = "login", method = RequestMethod.POST)
    public boolean userLogin() {


        return true;
    }
}
