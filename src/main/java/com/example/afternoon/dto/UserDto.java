package com.example.afternoon.dto;

import com.example.afternoon.enumeration.Status;
import com.sun.istack.NotNull;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {

  private Long id;

  private String userName;

  @NotNull
  private String pin;

  @NotNull
  private String phone;

  @NotNull
  private String email;

  private String department;

  private String pass;

  private boolean isAdmin;

  private boolean isManager;

  private Status status;

  private Date joiningDate;

  private Date createdAt;

  private Date updatedAt;

  private Long teamId;

  private Long createdBy;

  private Long updatedBy;

}
