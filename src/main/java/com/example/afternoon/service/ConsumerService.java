package com.example.afternoon.service;

import com.example.afternoon.dto.ConsumerRequestDto;
import com.example.afternoon.dto.ConsumerResponseDto;
import java.util.List;

public interface ConsumerService {

  ConsumerResponseDto create(ConsumerRequestDto consumerRequestDto);

  void create(List<ConsumerRequestDto> consumerRequestDtoList);

  ConsumerResponseDto getConsumeInfoById(Long userId);

  List<ConsumerResponseDto> getConsumerInfoByDate(String date);

  ConsumerResponseDto getConsumerInfoByUserIdAndDate(Long userId, String date);

  List<ConsumerResponseDto> getAllConsumerInfoUserId(Long userId);

  List<ConsumerResponseDto> getAllConsumedRecords();
}
