package com.TransPoin.TransPoin.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "reward")
public class Reward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reward")
    private Integer id;

    @Column(name = "nama_reward")
    private String namaReward;

    @Column(name = "poin_dibutuhkan")
    private Integer poinDibutuhkan;

    private String deskripsi;

    // getter setter
}