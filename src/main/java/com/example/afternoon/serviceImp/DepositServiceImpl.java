package com.example.afternoon.serviceImp;

import com.example.afternoon.dto.DepositDto;
import com.example.afternoon.entity.Deposit;
import com.example.afternoon.entity.UserProfile;
import com.example.afternoon.repository.DepositRepository;
import com.example.afternoon.repository.UserRepository;
import com.example.afternoon.service.DepositService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class DepositServiceImpl implements DepositService {

  private final DepositRepository depositRepository;
  private final UserRepository userRepository;

  public DepositServiceImpl(DepositRepository depositRepository,
                            UserRepository userRepository) {
    this.depositRepository = depositRepository;
    this.userRepository = userRepository;
  }

  @Override
  public DepositDto create(DepositDto depositDto) {
    if (depositDto.getId() != null) {
      throw new RuntimeException("deposit id should be null for new entry");
    }
    Optional<UserProfile> user = userRepository.findById(depositDto.getUserId());
    user.ifPresent(userProfile -> depositDto.setUserId(userProfile.getId()));
    Deposit deposit = new Deposit();
    BeanUtils.copyProperties(depositDto, deposit);
    DepositDto response = new DepositDto();
    BeanUtils.copyProperties(depositRepository.save(deposit), response);
    return response;
  }

  @Override
  public List<DepositDto> getAllDeposits() {

    List<Deposit> depositList =
        this.depositRepository.findAll();

    List<DepositDto> depositDtoList = new ArrayList<>();

    if (depositList.isEmpty()) {
      return depositDtoList;
    }
    depositList.forEach(team -> {
      DepositDto depositDto = new DepositDto();
      BeanUtils.copyProperties(team, depositDto);
      depositDtoList.add(depositDto);
    });

    return depositDtoList;

  }
}
