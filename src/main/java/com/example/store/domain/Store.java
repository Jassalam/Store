package com.example.store.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "owner_Id")
    private Owner owner;

}


