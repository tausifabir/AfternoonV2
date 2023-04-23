package com.example.afternoon.repository;

import com.example.afternoon.entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jdbcConsumerRepository")
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {
}
