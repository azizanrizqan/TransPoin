package com.TransPoin.TransPoin.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "penukaran")
public class Penukaran {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_penukaran")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_reward")
    private Reward reward;

    private LocalDate tanggal;

    private String status;

    // getter setter
}