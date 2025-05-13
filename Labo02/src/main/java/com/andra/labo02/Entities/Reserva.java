package com.andra.labo02.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name ="reserva")
@Data
public class Reserva {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_Posada")
    private Posada posada;

    @ManyToOne
    @JoinColumn(name = "ID_huesped")
    private Persona huesped;

    @ManyToOne
    @JoinColumn(name = "ID_estado")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "ID_salon")
    private Salon salon;

    @OneToMany(mappedBy = "reserva")
    private List<Recibo> recibos;

    @Column(name = "fecha_de_entrada")
    private String fechaEntrada;

    @Column(name = "fecha_de_salida")
    private String fechaSalida;
}
