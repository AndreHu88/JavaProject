package com.jack.hrmanagement.Service;

import com.jack.hrmanagement.Dao.UserDao;
import com.jack.hrmanagement.Model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 根据名字查找用户
     */
    public User selectUserByName(String username) {
        return userDao.searchUserByUsername(username);
    }


    /**
     *  用户登录
     */
    public boolean userLogin(String username, String password) {

        return userDao.userLogin(username, password);
    }


}
