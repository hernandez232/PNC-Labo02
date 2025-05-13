package com.andra.labo02.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="puntos")
@Data
public class Puntos {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
