package com.andra.labo02.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name ="puntos")
@Data
public class Puntos {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_huesped")
    private Persona huesped;

    @ManyToOne
    @JoinColumn(name = "ID_empleado")
    private Persona empleado;

    private int puntos;

    @Column(name = "ultima_fecha_de_aplicacion")
    private String ultimaAplicacion;
}
