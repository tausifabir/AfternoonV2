package com.example.afternoon.controller;

import com.example.afternoon.dto.UserDto;
import com.example.afternoon.entity.UserProfile;
import com.example.afternoon.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public UserProfile createUser(){
        return userService.create();
    }

    @PostMapping("/v2/create")
    public UserDto createUserV2(@RequestBody UserDto userDto){
        return userService.createV2(userDto);
    }

    @GetMapping("/all")
    public List<UserProfile> getUsers(){
        return userService.getAllUsers();
    }
}
