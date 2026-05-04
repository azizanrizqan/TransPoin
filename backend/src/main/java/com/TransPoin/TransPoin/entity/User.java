package com.TransPoin.TransPoin.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;

    private String nama;
    private String email;

    @Column(name = "total_poin")
    private Integer totalPoin;

    @OneToMany(mappedBy = "user")
    private List<Perjalanan> perjalananList;

    // getter setter
    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

        public String getNama() { return nama; }
        public void setNama(String nama) { this.nama = nama; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public Integer getTotalPoin() { return totalPoin; }
        public void setTotalPoin(Integer totalPoin) { this.totalPoin = totalPoin; }
    }