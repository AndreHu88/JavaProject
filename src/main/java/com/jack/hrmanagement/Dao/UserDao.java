package com.jack.hrmanagement.Dao;

import com.jack.hrmanagement.Model.User;

public interface UserDao {

    User searchUserByUsername(String username);

    boolean userLogin(String username, String password);

    boolean userRegister(User user);

    boolean refreshToken();


}
