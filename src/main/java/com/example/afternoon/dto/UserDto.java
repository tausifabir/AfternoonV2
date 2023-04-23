package com.example.afternoon.dto;

import com.example.afternoon.entity.UserProfile;
import com.example.afternoon.enumeration.Status;
import com.sun.istack.NotNull;
import java.util.Date;

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

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public boolean isAdmin() {
    return isAdmin;
  }

  public void setAdmin(boolean admin) {
    isAdmin = admin;
  }

  public boolean isManager() {
    return isManager;
  }

  public void setManager(boolean manager) {
    isManager = manager;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Date getJoiningDate() {
    return joiningDate;
  }

  public void setJoiningDate(Date joiningDate) {
    this.joiningDate = joiningDate;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Long getTeamId() {
    return teamId;
  }

  public void setTeamId(Long teamId) {
    this.teamId = teamId;
  }

  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public Long getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(Long updatedBy) {
    this.updatedBy = updatedBy;
  }

  public UserProfile toEntity() {
    UserProfile userProfile = new UserProfile();
    userProfile.setId(this.id);
    userProfile.setUserName(this.userName);
    userProfile.setPin(this.pin);
    userProfile.setPhone(this.phone);
    userProfile.setEmail(this.email);
    userProfile.setDepartment(this.department);
    userProfile.setPass(this.pass);
    userProfile.setAdmin(this.isAdmin);
    userProfile.setStatus(this.status);
    userProfile.setCreatedAt(this.createdAt);
    userProfile.setUpdatedAt(this.updatedAt);
    return userProfile;
  }

}
