package com.example.afternoon.serviceImp;

import com.example.afternoon.dto.UserDto;
import com.example.afternoon.entity.UserProfile;
import com.example.afternoon.repository.TeamRepository;
import com.example.afternoon.repository.UserRepository;
import com.example.afternoon.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final TeamRepository teamRepository;

    public UserServiceImpl(UserRepository userRepository, TeamRepository teamRepository) {
        this.userRepository = userRepository;
        this.teamRepository = teamRepository;
    }

    @Override
    public UserProfile create() {
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
    public UserDto createV2(UserDto userDto) {
        if(userDto.getId() != null){
            throw new RuntimeException("User id should be null for user creation!!");
        }
        UserProfile userProfile = userDto.toEntity();
        return userRepository.save(userProfile).toDto();
    }

    @Override
    public List<UserProfile> getAllUsers() {
        return userRepository.findAll();
    }
}
