package com.example.afternoon.entity;

import com.example.afternoon.enumeration.Status;
import com.sun.istack.NotNull;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Table;


@Setter
@Getter
@Entity
@Table("user_profile")
@ToString
public class UserProfile implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Setter(AccessLevel.NONE)
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

  @ManyToOne
  @JoinColumn(name = "team_id")
  private Team team;

  @ManyToOne
  @JoinColumn(name = "created_by_id")
  private UserProfile createdBy;


  @ManyToOne
  @JoinColumn(name = "updated_by_id")
  private UserProfile updatedBy;

}
