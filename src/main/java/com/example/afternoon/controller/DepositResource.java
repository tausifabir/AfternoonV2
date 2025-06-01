package com.example.afternoon.controller;

import com.example.afternoon.dto.DepositDto;
import com.example.afternoon.service.DepositService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/deposit")
public class DepositResource {

  private final DepositService depositService;

  public DepositResource(DepositService depositService) {
    this.depositService = depositService;
  }

  @PostMapping("/create")
  public DepositDto createDeposit(@RequestBody DepositDto depositDto) {
    return depositService.create(depositDto);
  }

  @GetMapping("/all")
  public List<DepositDto> getAllDeposits() {
    return depositService.getAllDeposits();
  }
}
