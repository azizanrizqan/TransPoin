package com.TransPoin.TransPoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.TransPoin.TransPoin.entity.UserReward;
import com.TransPoin.TransPoin.entity.UserRewardId;

public interface UserRewardRepository extends JpaRepository<UserReward, UserRewardId> {
}