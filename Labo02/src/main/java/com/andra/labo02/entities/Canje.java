package com.andra.labo02.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name ="reserva")
@Data
public class Canje {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_huesped")
    private Persona huesped;

    @ManyToOne
    @JoinColumn(name = "ID_regalia")
    private Regalia regalia;

    private String fecha;
}
