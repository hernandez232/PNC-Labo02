package com.andra.labo02.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name ="tono")
@Data
public class Tono {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "tono")
    private List<Piso> pisos;

    private String nombre;
}
