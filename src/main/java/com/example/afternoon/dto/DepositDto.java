package com.example.afternoon.dto;


import com.example.afternoon.entity.Deposit;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DepositDto {

  private Long id;

  private double depositedAmount;

  private Date depositedDate;

  private String previousDepositedDate;

  private Date createdAt;

  private Date updatedAt;

  private Long userId;

  private Long createdBy;

  private Long updatedBy;

  public Deposit toEntity() {
    Deposit deposit = new Deposit();
    deposit.setId(this.id);
    deposit.setDepositedAmount(this.depositedAmount);
    deposit.setPreviousDepositedDate(this.previousDepositedDate);
    deposit.setCreatedAt(this.createdAt);
    deposit.setUpdatedAt(this.updatedAt);
    return deposit;
  }
}
