package com.example.afternoon.controller;

import com.example.afternoon.dto.UserDto;
import com.example.afternoon.entity.UserProfile;
import com.example.afternoon.service.UserService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/user")
public class UserResource {

  private final UserService userService;

  public UserResource(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/create")
  public UserDto createUser(@RequestBody UserDto userDto) {
    return userService.create(userDto);
  }

  @PostMapping("/create-demo-user")
  public UserProfile createDemoUser() {
    return userService.createDemoUser();
  }

  @GetMapping("/{id}")
  public UserDto getUserById(@PathVariable Long id) {
    return userService.getUserById(id);
  }

  @GetMapping("/all")
  public List<UserProfile> getUsers() {
    return userService.getAllUsers();
  }
}
