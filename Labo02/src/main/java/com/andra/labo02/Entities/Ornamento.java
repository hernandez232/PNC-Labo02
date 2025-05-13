package com.andra.labo02.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="ornamento")
@Data
public class Ornamento {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_salon")
    private Salon salon;

    private String nombre;
}
