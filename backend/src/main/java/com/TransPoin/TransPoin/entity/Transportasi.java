package com.TransPoin.TransPoin.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "transportasi")
public class Transportasi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transportasi")
    private Integer id;

    @Column(name = "nama_transportasi")
    private String namaTransportasi;

    @Column(name = "poin_per_km")
    private Integer poinPerKm;

    @OneToMany(mappedBy = "transportasi")
    private List<Perjalanan> perjalananList;

    // getter setter
}