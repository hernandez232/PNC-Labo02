package com.andra.labo02.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name ="habitacion")
@Data
public class Habitacion {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_piso")
    private Piso piso;

    @OneToMany(mappedBy = "habitacion")
    private List<DetalleEspecial> detallesEspecial;

    @OneToMany(mappedBy = "habitacion")
    private List<OrdenTrabajo> ordenesTrabajo;

    private String nombre;

    @Column(name = "esta_disponible")
    private boolean disponibilidad;
}
