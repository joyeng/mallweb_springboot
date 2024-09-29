package com.liaojoy.mallweb_springboot.controller;

import com.liaojoy.mallweb_springboot.dto.UserRegisterRequest;
import com.liaojoy.mallweb_springboot.model.User;
import com.liaojoy.mallweb_springboot.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users/register")
    public ResponseEntity<User> register(@RequestBody @Valid UserRegisterRequest userRegisterRequest) {
        //從資料庫回傳id
        Integer userId = userService.register(userRegisterRequest);

        //根據id去查詢user
        User user = userService.getUserById(userId);

        //將數據回傳給前端
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
