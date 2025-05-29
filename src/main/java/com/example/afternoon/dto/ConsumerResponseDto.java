package com.example.afternoon.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ConsumerResponseDto {

  private Long id;
  private Long userId;
  private String userName;
  private LocalDate spentDate;
  private LocalDate spentAmount;
  private String foodName;
}
