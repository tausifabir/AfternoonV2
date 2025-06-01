package com.example.afternoon.entity;

import java.time.Instant;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table("consumer")
@Setter
@Getter
@ToString
public class Consumer implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private UserProfile userProfile;

  private double spentAmount;

  private Date spentDate;

  private String foodName;

  private Instant createdAt;

  private Instant updatedAt;

  @ManyToOne
  @JoinColumn(name = "created_by_id")
  private UserProfile createdBy;

  @ManyToOne
  @JoinColumn(name = "updated_by_id")
  private UserProfile updatedBy;

}
