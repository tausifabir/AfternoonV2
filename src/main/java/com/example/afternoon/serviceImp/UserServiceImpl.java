package com.example.afternoon.serviceImp;

import com.example.afternoon.dto.UserDto;
import com.example.afternoon.entity.UserProfile;
import com.example.afternoon.repository.UserRepository;
import com.example.afternoon.service.UserService;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;


  @Override
  public UserDto create(UserDto userDto) {
    if (userDto.getId() != null) {
      throw new RuntimeException("User id should be null for user creation!!");
    }
    UserProfile userProfile = new UserProfile();
    BeanUtils.copyProperties(userDto, userProfile);
    UserDto response = new UserDto();
    BeanUtils.copyProperties(userRepository.save(userProfile), response);
    return response;
  }


  @Override
  public UserProfile createDemoUser() {
    UserProfile userProfile = new UserProfile();
    userProfile.setUserName("Java User");
    userProfile.setPin("1001");
    userProfile.setPhone("01234567890");
    userProfile.setEmail("1234@email.com");
    userProfile.setDepartment("Software");
    userProfile.setPass("1234");
    userProfile.setAdmin(true);
    userProfile.setManager(true);
    userProfile.setJoiningDate(new Date());
    userProfile.setCreatedAt(new Date());
    /*List<Team> teams = teamRepository.findAll();
        user.setTeam(teams.get(0));*/
    return userRepository.save(userProfile);
  }

  @Override
  public UserDto getUserById(Long id) {
    UserProfile user =
        userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found by this id:" + id));
    UserDto userDto = new UserDto();
    BeanUtils.copyProperties(user, userDto);
    return userDto;
  }

  @Override
  public List<UserProfile> getAllUsers() {
    return userRepository.findAll();
  }
}
