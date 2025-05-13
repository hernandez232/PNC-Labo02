package com.andra.labo02.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="orden_trabajo")
@Data
public class OrdenTrabajo {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
