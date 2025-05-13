package com.andra.labo02.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="recibo")
@Data
public class Recibo {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_reserva")
    private Reserva reserva;

    private String fecha;

    private String hora;

    private float total;
}
