package com.example.afternoon.serviceImp;

import com.example.afternoon.dto.ConsumerRequestDto;
import com.example.afternoon.dto.ConsumerResponseDto;
import com.example.afternoon.service.ConsumerService;
import java.time.LocalDate;
import java.util.List;

public class ConsumerServiceImpl implements ConsumerService {

  @Override
  public ConsumerResponseDto create(ConsumerRequestDto consumerRequestDto) {
    return null;
  }

  @Override
  public List<ConsumerResponseDto> create(List<ConsumerRequestDto> consumerRequestDtoList) {
    return List.of();
  }

  @Override
  public ConsumerResponseDto getTeamById(Long id) {
    return null;
  }

  @Override
  public List<ConsumerResponseDto> getConsumerInfoByDate(LocalDate date) {
    return List.of();
  }

  @Override
  public List<ConsumerResponseDto> getConsumerInfoConsumerId(Long id) {
    return List.of();
  }

  @Override
  public List<ConsumerResponseDto> getAllTeams() {
    return List.of();
  }
}
