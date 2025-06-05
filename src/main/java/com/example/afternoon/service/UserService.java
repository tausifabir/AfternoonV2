package com.example.afternoon.service;

import com.example.afternoon.dto.UserDto;
import com.example.afternoon.entity.UserProfile;
import java.util.List;


public interface UserService {


  void preValidateRequest(UserDto userDto);

  UserDto create(UserDto userDto);

  UserProfile createDemoUser();

  UserDto getUserById(Long id);

  List<UserProfile> getAllUsers();
}
