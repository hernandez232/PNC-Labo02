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
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_piso")
    private Piso piso;

    @OneToMany(mappedBy = "habitacion")
    private List<Detalle_especial> detalle_especial;

    @OneToMany(mappedBy = "habitacion")
    private List<Orden_trabajo> orden_trabajo;

    private String nombre;

    @Column(name = "esta_disponible")
    private boolean disponibilidad;
}
