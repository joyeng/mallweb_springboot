package com.liaojoy.mallweb_springboot.service;

import com.liaojoy.mallweb_springboot.dto.UserLoginRequest;
import com.liaojoy.mallweb_springboot.dto.UserRegisterRequest;
import com.liaojoy.mallweb_springboot.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);

}
