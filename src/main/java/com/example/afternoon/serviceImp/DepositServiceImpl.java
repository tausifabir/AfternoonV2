package com.example.afternoon.serviceImp;

import com.example.afternoon.dto.DepositDto;
import com.example.afternoon.entity.Deposit;
import com.example.afternoon.entity.UserProfile;
import com.example.afternoon.repository.DepositRepository;
import com.example.afternoon.repository.UserRepository;
import com.example.afternoon.service.DepositService;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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
    if(depositDto.getId() != null){
      throw new RuntimeException("deposit id should be null for new entry");
    }
    Optional<UserProfile> user = userRepository.findById(depositDto.getUserId());
    if(user.isPresent()){
      depositDto.setUserId(user.get().getId());
    }
    Deposit deposit = depositDto.toEntity();
    return depositRepository.save(deposit).toDto();
  }

  @Override
  public List<DepositDto> getAllDeposits() {
    return depositRepository.findAll().stream().map(Deposit::toDto).collect(Collectors.toList());
  }
}
