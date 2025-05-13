package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Regalia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iRegaliaRepository extends iGenericRepository<Regalia, Integer> {

    //JPA functions
    Regalia findById(int id);
    Regalia findByDescripcion(String descripcion);

    // nat query
    @Query(nativeQuery = true, value = "select * from regalia where regalia.puntos_requeridos = :puntosRequeridos")
    public Regalia findByPuntosRequeridos(@Param("puntosRequeridos") Float puntosRequeridos);

    // deriv. query
    @Query("SELECT r FROM Regalia r WHERE r.nombre = :nombre")
    public Regalia findByNombre(String nombre);
}
