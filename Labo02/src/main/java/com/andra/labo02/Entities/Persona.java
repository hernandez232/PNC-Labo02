package com.andra.labo02.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name ="persona")
@Data
public class Persona {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_rol")
    private Rol rol;

    @OneToMany(mappedBy = "empleado")
    private List<OrdenTrabajo> ordenesTrabajo;

    @OneToMany(mappedBy = "empleado")
    private List<Guardian> guardianes;

    @OneToMany(mappedBy = "supervisor")
    private List<Guardian> supervisores;

    @OneToMany(mappedBy = "huesped")
    private List<Reserva> reservas;

    @OneToMany(mappedBy = "huesped")
    private List<Puntos> puntos; // Lista de huéspedes que han acumulado puntos

    @OneToMany(mappedBy = "empleado")
    private List<Puntos> aplicados; // Lista de empleados que han aplicado puntos

    @OneToMany(mappedBy = "huesped")
    private List<Canje> canjes;

    /*
    @ManyToMany
    @JoinTable(
            name = "canje",
            joinColumns = @JoinColumn(name = "ID_huesped"),
            inverseJoinColumns = @JoinColumn(name = "ID_regalia")
    )
    private List<Regalia> regalias;
    */

    private String nombre;

    private String apellido;

    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;

    private String correo;

    @Column(name = "contraseña")
    private String contra;
}
