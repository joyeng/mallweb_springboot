package com.liaojoy.mallweb_springboot.dao;

import com.liaojoy.mallweb_springboot.dto.UserRegisterRequest;
import com.liaojoy.mallweb_springboot.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
