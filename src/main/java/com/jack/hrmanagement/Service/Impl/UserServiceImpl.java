package com.jack.hrmanagement.Service.Impl;

import com.jack.hrmanagement.Mapper.UserDao;
import com.jack.hrmanagement.Model.User;
import com.jack.hrmanagement.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * User Impl
 *
 * @author Jack
 * @create 2019-08-28 16:23
 **/

@Service
public class UserServiceImpl implements UserService {

    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;


    @Override
    public User userRegister(User user) {

        // 先判断是否用户名是否存在
        if (selectUserByName(user.getUsername()) != null) {

            return null;
        }
        return user;
    }

    @Override
    public User selectUserByName(String userName) {

        logger.debug(userName);
        return null;
    }
}
