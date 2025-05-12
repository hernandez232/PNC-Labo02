package com.andra.labo02.Repositories;

import com.andra.labo02.entities.Tono;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iTonoInterface extends iGenericRepository<Tono, Integer> {
    Tono findById(int id);

    //nat query
    @Query(nativeQuery = true, value = "select * from tono where tono.nombre = :nombre")
    public Tono findByNombre(@Param("nombre") String nombre);

    //deriv. query
    @Query("SELECT o FROM Posada o WHERE o.nombre = :nombre")
    public Tono findByRol(@Param("nombre") String nombre);
}
