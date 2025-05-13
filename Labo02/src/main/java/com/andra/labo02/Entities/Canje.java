package com.andra.labo02.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="canje")
@Data
public class Canje {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_huesped")
    private Persona huesped;

    @ManyToOne
    @JoinColumn(name = "ID_regalia")
    private Regalia regalia;

    private String fecha;
}
