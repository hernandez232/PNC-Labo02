package com.andra.labo02.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name ="piso")
@Data
public class Piso {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_posada")
    private Posada posada;

    @ManyToOne
    @JoinColumn(name = "ID_tono")
    private Tono tono;

    @OneToMany(mappedBy = "piso")
    private List<Habitacion> habitaciones;

    @OneToMany(mappedBy = "piso")
    private List<Rotacion> rotaciones;

    private String color;

    private String nombre;
}
