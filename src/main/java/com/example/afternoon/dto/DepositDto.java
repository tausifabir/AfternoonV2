package com.example.afternoon.dto;


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
}
