package com.example.afternoon.entity;

import com.example.afternoon.dto.UserDto;
import com.example.afternoon.enumeration.Status;
import com.sun.istack.NotNull;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table("user_profile")
public class UserProfile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
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

    public UserProfile getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(UserProfile updatedBy) {
        this.updatedBy = updatedBy;
    }


    public UserProfile getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserProfile createdBy) {
        this.createdBy = createdBy;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", pin='" + pin + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", team=" + team +
                ", pass='" + pass + '\'' +
                ", isAdmin=" + isAdmin +
                ", isManager=" + isManager +
                ", status=" + status +
                ", joiningDate=" + joiningDate +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", createdBy=" + createdBy +
                ", updatedBy=" + updatedBy +
                '}';
    }

    public UserDto toDto(){
        UserDto userDto = new UserDto();
        userDto.setId(this.id);
        userDto.setUserName(this.userName);
        userDto.setPin(this.pin);
        userDto.setPhone(this.phone);
        userDto.setEmail(this.email);
        userDto.setDepartment(this.department);
        userDto.setPass(this.pass);
        userDto.setAdmin(this.isAdmin);
        userDto.setStatus(this.status);
        userDto.setCreatedAt(this.createdAt);
        userDto.setUpdatedAt(this.updatedAt);
        return userDto;
    }
}
