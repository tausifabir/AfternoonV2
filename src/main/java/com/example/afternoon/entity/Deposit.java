package com.example.afternoon.entity;
import org.springframework.data.relational.core.mapping.Table;
import com.example.afternoon.dto.DepositDto;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table("deposit")
public class Deposit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    private double depositedAmount;

    private Date depositedDate;

    @Lob
    private String previousDepositedDate;

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

    public UserProfile getUser() {
        return userProfile;
    }

    public void setUser(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public UserProfile getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserProfile createdBy) {
        this.createdBy = createdBy;
    }

    public UserProfile getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(UserProfile updatedBy) {
        this.updatedBy = updatedBy;
    }

    public DepositDto toDto() {
        DepositDto depositDto = new DepositDto();
        depositDto.setId(this.id);
        depositDto.setDepositedAmount(this.depositedAmount);
        depositDto.setPreviousDepositedDate(this.previousDepositedDate);
        depositDto.setCreatedAt(this.createdAt);
        depositDto.setUpdatedAt(this.updatedAt);
        //depositDto.setCreatedBy(this.user.getId());
        return depositDto;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "id=" + id +
                ", depositedAmount=" + depositedAmount +
                ", depositedDate=" + depositedDate +
                ", previousDepositedDate='" + previousDepositedDate + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", user=" + userProfile +
                ", createdBy=" + createdBy +
                ", updatedBy=" + updatedBy +
                '}';
    }
}
