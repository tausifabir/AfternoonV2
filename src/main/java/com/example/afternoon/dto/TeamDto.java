package com.example.afternoon.dto;

import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeamDto {
  private Long id;
  private String teamName;
  private int memberLimit;
}
