package com.example.afternoon.service;

import com.example.afternoon.dto.DepositDto;

import java.util.List;

public interface DepositService {

  DepositDto create(DepositDto depositDto);

  List<DepositDto> getAllDeposits();
}
