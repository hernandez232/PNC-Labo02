package com.andra.labo02.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name ="posada")
@Data
public class Posada {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "posada")
    private List<Salon> salones;

    @OneToMany(mappedBy = "posada")
    private List<Piso> pisos;

    @OneToMany(mappedBy = "posada")
    private List<Guardian> guardianes;

    @OneToMany(mappedBy = "posada")
    private List<Reserva> reservas;

    private String nombre;

    private String direccion;
}
