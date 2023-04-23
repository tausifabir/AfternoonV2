package com.example.afternoon.entity;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table("consumer")
public class Consumer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserProfile userProfile;

    private double spentAmount;

    private Date  spentDate;

    private String foodName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserProfile getUser() {
        return userProfile;
    }

    public void setUser(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public double getSpentAmount() {
        return spentAmount;
    }

    public void setSpentAmount(double spentAmount) {
        this.spentAmount = spentAmount;
    }

    public Date getSpentDate() {
        return spentDate;
    }

    public void setSpentDate(Date spentDate) {
        this.spentDate = spentDate;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", user=" + userProfile +
                ", spentAmount=" + spentAmount +
                ", spentDate=" + spentDate +
                ", foodName='" + foodName + '\'' +
                '}';
    }
}
