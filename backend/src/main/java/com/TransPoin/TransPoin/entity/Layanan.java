package com.TransPoin.TransPoin.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "layanan")
public class Layanan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_layanan")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @Column(name = "jenis_layanan")
    private String jenisLayanan;

    private String deskripsi;
    private String status;
    private LocalDate tanggal;

    // getter setter
    
}