package com.example.afternoon.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Table;


@Entity
@Table("deposit")
@ToString
public class Deposit implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  @Setter(AccessLevel.NONE)
  private Long id;

  private double depositedAmount;

  private Date depositedDate;

  //  @Lob
  //  private String previousDepositedDate;

  private Date createdAt;

  private Date updatedAt;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private UserProfile userProfile;

  @ManyToOne
  @JoinColumn(name = "created_by_id")
  private UserProfile createdBy;

  @ManyToOne
  @JoinColumn(name = "updated_by_id")
  private UserProfile updatedBy;

}
