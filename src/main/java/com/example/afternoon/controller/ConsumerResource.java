package com.example.afternoon.controller;

import com.example.afternoon.dto.ConsumerRequestDto;
import com.example.afternoon.dto.ConsumerResponseDto;
import com.example.afternoon.service.ConsumerService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/consume")
public class ConsumerResource {

  private final ConsumerService consumerService;

  public ConsumerResource(ConsumerService consumerService) {
    this.consumerService = consumerService;
  }

  @PostMapping("/create")
  public ConsumerResponseDto createConsume(@RequestBody ConsumerRequestDto consumerRequestDto) {
    return consumerService.create(consumerRequestDto);
  }


  @PostMapping("/create/batch")
  public HttpStatus createConsumes(@RequestBody List<ConsumerRequestDto> consumerRequestDtoList) {
    consumerService.create(consumerRequestDtoList);
    return HttpStatus.OK;
  }

  @GetMapping("/{id}")
  public ConsumerResponseDto getConsumerById(@PathVariable Long id) {
    return consumerService.getConsumeInfoById(id);
  }

  @GetMapping("/consumer-info")
  public List<ConsumerResponseDto> getConsumerInfoByDate(@RequestParam String consumedDate) {
    return consumerService.getConsumerInfoByDate(consumedDate);
  }

  @GetMapping("/consumer-info/{userId}")
  public ConsumerResponseDto getConsumerInfoByUserIdAndDate(
      @PathVariable Long userId,
      @RequestParam String consumedDate) {
    return consumerService.getConsumerInfoByUserIdAndDate(userId, consumedDate);
  }


  @GetMapping("/consumer-info/{userId}")
  public List<ConsumerResponseDto> getConsumerInfoByUserId(@PathVariable Long userId) {
    return consumerService.getAllConsumerInfoUserId(userId);
  }

  @GetMapping("/all")
  public List<ConsumerResponseDto> getAllConsumedRecords() {
    return consumerService.getAllConsumedRecords();
  }
}
