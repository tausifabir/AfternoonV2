package com.example.afternoon.mapper;

import com.example.afternoon.dto.DepositDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class DepositDtoRowMapper implements RowMapper<DepositDto> {
  @Override
  public DepositDto mapRow(ResultSet rs, int rowNum) throws SQLException {
    return null;
  }
}
