package com.example.afternoon.repository;

import com.example.afternoon.entity.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jdbcDepositRepository")
public interface DepositRepository extends JpaRepository<Deposit, Long> {
}
