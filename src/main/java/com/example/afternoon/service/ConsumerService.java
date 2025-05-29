package com.example.afternoon.service;

import com.example.afternoon.dto.ConsumerRequestDto;
import com.example.afternoon.dto.ConsumerResponseDto;
import com.example.afternoon.dto.TeamDto;
import java.time.LocalDate;
import java.util.List;

public interface ConsumerService {

  ConsumerResponseDto create(ConsumerRequestDto consumerRequestDto);

  List<ConsumerResponseDto> create(List<ConsumerRequestDto> consumerRequestDtoList);

  ConsumerResponseDto getTeamById(Long id);

  List<ConsumerResponseDto> getConsumerInfoByDate(LocalDate date);

  List<ConsumerResponseDto> getConsumerInfoConsumerId(Long id);

  List<ConsumerResponseDto> getAllTeams();
}
