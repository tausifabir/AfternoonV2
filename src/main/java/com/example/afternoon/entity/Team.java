package com.example.afternoon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.Instant;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;


@Entity
@Table("team")
@Setter
@Getter
public class Team implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  private String teamName;
  private int memberLimit;

  private Instant createdAt;

  private Instant updatedAt;

  @ManyToOne
  @JoinColumn(name = "created_by_id")
  private UserProfile createdBy;

  @ManyToOne
  @JoinColumn(name = "updated_by_id")
  private UserProfile updatedBy;
}
