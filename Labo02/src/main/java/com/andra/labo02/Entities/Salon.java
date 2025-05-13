package com.andra.labo02.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name ="salon")
@Data
public class Salon {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_posada")
    private Posada posada;

    @OneToMany(mappedBy = "salon")
    private List<Ornamento> ornamentos;

    @OneToMany(mappedBy = "salon")
    private List<Reserva> reservas;

    private int capacidad;

    @Column(name = "esta_disponible")
    private boolean disponibilidad;
}
