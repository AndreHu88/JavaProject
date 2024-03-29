package com.jack.hrmanagement.Mapper;

import com.jack.hrmanagement.Model.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao {

    User searchUserByUsername(String username);

    boolean userLogin(String username, String password);

    boolean userRegister(User user);

    boolean refreshToken();

    User getUserInfo(String userID);

}
