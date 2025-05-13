package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Canje;
import com.andra.labo02.Entities.Persona;
import com.andra.labo02.Entities.Regalia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iCanjeRepository extends iGenericRepository<Canje, Integer> {

    //JPA functions
    Canje findById(int id);
    Canje findByHuesped(Persona huesped);
    Canje findByRegalia(Regalia regalia);

    //nat query
    @Query(nativeQuery = true, value = "select * from canje where canje.fecha = :fecha")
    public Canje findByFecha(@Param("fecha") String fecha);

    //deriv. query
    @Query("SELECT c FROM Canje c WHERE c.regalia.nombre = :nombre")
    public Canje findByRegalia(@Param("nombre") String nombre);
}
