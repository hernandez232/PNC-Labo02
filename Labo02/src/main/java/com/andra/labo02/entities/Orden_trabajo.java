package com.andra.labo02.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name ="orden_trabajo")
@Data
public class Orden_trabajo {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_habitacion")
    private Habitacion habitacion;

    @ManyToOne
    @JoinColumn(name = "ID_empleado")
    private Persona empleado;

    private String fecha;

    private String hora;

    private String descripcion;
}
