package com.andra.labo02.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="detalle_especial")
@Data
public class DetalleEspecial {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_habitacion")
    private Habitacion habitacion;

    private String nombre;

    private String descripcion;
}
