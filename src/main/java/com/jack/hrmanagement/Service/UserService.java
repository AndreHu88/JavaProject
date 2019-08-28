package com.jack.hrmanagement.Service;

import com.jack.hrmanagement.Dao.UserDao;
import com.jack.hrmanagement.Model.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.soap.SOAPBinding;

public interface UserService {

    /**
     * 根据名字查找用户
     */
    User selectUserByName(String userName);


    /**
     *  用户注册
     */
    User userRegister(User user);


}
