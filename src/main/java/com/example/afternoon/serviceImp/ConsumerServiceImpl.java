package com.example.afternoon.serviceImp;

import com.example.afternoon.dto.ConsumerRequestDto;
import com.example.afternoon.dto.ConsumerResponseDto;
import com.example.afternoon.entity.Consumer;
import com.example.afternoon.repository.ConsumerRepository;
import com.example.afternoon.service.ConsumerService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConsumerServiceImpl implements ConsumerService {

  private final ConsumerRepository consumerRepository;

  @Override
  public ConsumerResponseDto create(ConsumerRequestDto consumerRequestDto) {
    if (consumerRequestDto.getId() == null) {
      throw new RuntimeException("Consumer should be null for new entry");
    }
    Consumer consumer = new Consumer();
    BeanUtils.copyProperties(consumerRequestDto, consumer);
    this.consumerRepository.save(consumer);
    ConsumerResponseDto consumerResponseDto = new ConsumerResponseDto();
    BeanUtils.copyProperties(consumer, consumerResponseDto);
    return consumerResponseDto;
  }

  @Override
  public void create(List<ConsumerRequestDto> consumerRequestDtoList) {
    if (!consumerRequestDtoList.isEmpty()) {
      List<Consumer> consumerList = new ArrayList<>();
      for (ConsumerRequestDto consumerRequestDto : consumerRequestDtoList) {
        Consumer consumer = new Consumer();
        BeanUtils.copyProperties(consumerRequestDto, consumer);
        consumerList.add(consumer);

      }
      consumerRepository.saveAll(consumerList);
    }
  }

  @Override
  public ConsumerResponseDto getConsumeInfoById(Long id) {
    Consumer consumer = this.consumerRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Consumer not found by this id:" + id));
    ConsumerResponseDto consumerResponseDto = new ConsumerResponseDto();
    BeanUtils.copyProperties(consumer, consumerResponseDto);
    return consumerResponseDto;
  }

  @Override
  public List<ConsumerResponseDto> getConsumerInfoByDate(String date) {

    List<Consumer> consumerList = new ArrayList<>();
    consumerList = this.consumerRepository.findConsumerBySpentDate(date);
    return getConsumerResponseList(consumerList);
  }

  @Override
  public ConsumerResponseDto getConsumerInfoByUserIdAndDate(Long userId, String date) {
    Consumer consumer = this.consumerRepository.findConsumerByUserIdAndSpentDate(userId, date)
        .orElseThrow(() ->
            new RuntimeException("Consumer not found by this userId: " + userId + "and date: " + date));
    ConsumerResponseDto consumerResponseDto = new ConsumerResponseDto();
    BeanUtils.copyProperties(consumer, consumerResponseDto);
    return consumerResponseDto;

  }

  @Override
  public List<ConsumerResponseDto> getAllConsumerInfoUserId(Long userId) {

    List<Consumer> consumerList = this.consumerRepository.findConsumerByUserId(userId);
    return getConsumerResponseList(consumerList);

  }

  private List<ConsumerResponseDto> getConsumerResponseList(List<Consumer> consumerList) {
    List<ConsumerResponseDto> consumerResponseDtoList = new ArrayList<>();
    if (!consumerList.isEmpty()) {
      consumerList.forEach(
          consumer -> {
            ConsumerResponseDto consumerResponseDto = new ConsumerResponseDto();
            BeanUtils.copyProperties(consumer, consumerResponseDto);
            consumerResponseDtoList.add(consumerResponseDto);
          });
    }
    return consumerResponseDtoList;
  }

  @Override
  public List<ConsumerResponseDto> getAllConsumedRecords() {
    return List.of();
  }
}
