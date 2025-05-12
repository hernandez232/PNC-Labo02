package com.andra.labo02.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name ="regalia")
@Data
public class Regalia {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "regalia")
    private List<Canje> canjes;

    /*
    @ManyToMany(mappedBy = "regalias")
    private List<Persona> huespedes;
    */

    private String nombre;

    private String descripcion;

    @Column(name = "puntos_requeridos")
    private int puntosRequeridos;
}
