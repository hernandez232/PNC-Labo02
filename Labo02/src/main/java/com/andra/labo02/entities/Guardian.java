package com.andra.labo02.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name ="guardian")
@Data
public class Guardian {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_posada")
    private Posada posada;

    @ManyToOne
    @JoinColumn(name = "ID_empleado")
    private Persona empleado;

    @ManyToOne
    @JoinColumn(name = "ID_supervisor")
    private Persona supervisor;

    @OneToMany(mappedBy = "guardian")
    private List<Rotacion> rotaciones;

    private String departamento;

    @Column(name = "es_coordinador")
    private boolean coordinador;
}
