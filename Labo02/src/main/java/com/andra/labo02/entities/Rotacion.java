package com.andra.labo02.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="rotacion")
@Data
public class Rotacion {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_piso")
    private Piso piso;

    @ManyToOne
    @JoinColumn(name = "ID_Guardian")
    private Guardian guardian;

    private String turno;

    private String Mes;

    @Column(name = "esta_activo")
    private boolean activo;
}
