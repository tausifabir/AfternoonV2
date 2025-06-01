package com.example.afternoon.repository;

import com.example.afternoon.entity.Consumer;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("jdbcConsumerRepository")
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {

  @Query("SELECT model FROM Consumer as model WHERE cast(model.spentDate as date) = cast(:spentDate as date)")
  List<Consumer> findConsumerBySpentDate(String spentDate);

  @Query("SELECT model FROM Consumer as model WHERE model.userProfile.id =: userId")
  List<Consumer> findConsumerByUserId(Long userId);

  @Query("SELECT model FROM Consumer as model "
      + "WHERE model.userProfile.id =:userId "
      + "and cast(model.spentDate as date) = cast(:spentDate as date)")
  Optional<Consumer> findConsumerByUserIdAndSpentDate(Long userId, String spentDate);
}
