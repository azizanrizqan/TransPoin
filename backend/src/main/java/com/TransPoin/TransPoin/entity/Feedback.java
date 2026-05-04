package com.TransPoin.TransPoin.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_feedback")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_perjalanan")
    private Perjalanan perjalanan;

    private Integer rating;
    private String komentar;

    private String status;
    private LocalDate tanggal;

    // getter setter
}