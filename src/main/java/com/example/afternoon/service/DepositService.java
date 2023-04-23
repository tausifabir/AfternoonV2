package com.example.afternoon.service;

import com.example.afternoon.dto.DepositDto;

import java.util.List;

public interface DepositService {

  public DepositDto create(DepositDto depositDto);

  public List<DepositDto> getAllDeposits();
}
