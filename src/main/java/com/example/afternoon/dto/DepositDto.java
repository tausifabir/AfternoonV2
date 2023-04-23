package com.example.afternoon.dto;


import com.example.afternoon.entity.Deposit;

import java.util.Date;




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

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public double getDepositedAmount() {
    return depositedAmount;
  }

  public void setDepositedAmount(double depositedAmount) {
    this.depositedAmount = depositedAmount;
  }

  public Date getDepositedDate() {
    return depositedDate;
  }

  public void setDepositedDate(Date depositedDate) {
    this.depositedDate = depositedDate;
  }

  public String getPreviousDepositedDate() {
    return previousDepositedDate;
  }

  public void setPreviousDepositedDate(String previousDepositedDate) {
    this.previousDepositedDate = previousDepositedDate;
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

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
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
