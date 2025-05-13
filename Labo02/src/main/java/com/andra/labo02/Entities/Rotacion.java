package com.andra.labo02.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="rotacion")
@Data
public class Rotacion {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_piso")
    private Piso piso;

    @ManyToOne
    @JoinColumn(name = "ID_Guardian")
    private Guardian guardian;

    private String turno;

    private String mes;

    @Column(name = "esta_activo")
    private boolean activo;
}
