package com.TransPoin.TransPoin.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "perjalanan")
public class Perjalanan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perjalanan")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_transportasi")
    private Transportasi transportasi;

    private Double jarak;

    @Column(name = "poin_didapat")
    private Integer poinDidapat;

    private LocalDate tanggal;

    // getter setter
}