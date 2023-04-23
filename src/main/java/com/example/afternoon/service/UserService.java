package com.example.afternoon.service;

import com.example.afternoon.dto.UserDto;
import com.example.afternoon.entity.UserProfile;

import java.util.List;

public interface UserService {

    public UserProfile create();

    public UserDto createV2(UserDto userDto);

    public List<UserProfile> getAllUsers();
}
