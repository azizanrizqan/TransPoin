package com.TransPoin.TransPoin.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_reward")
@IdClass(UserRewardId.class)
public class UserReward {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_reward")
    private Reward reward;
}