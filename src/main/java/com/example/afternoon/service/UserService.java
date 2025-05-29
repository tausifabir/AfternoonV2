package com.example.afternoon.service;

import com.example.afternoon.dto.UserDto;
import com.example.afternoon.entity.UserProfile;
import java.util.List;


public interface UserService {

  UserDto create(UserDto userDto);

  UserProfile createDemoUser();

  List<UserProfile> getAllUsers();
}
