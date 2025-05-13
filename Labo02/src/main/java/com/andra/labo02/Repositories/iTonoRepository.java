package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Tono;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iTonoRepository extends iGenericRepository<Tono, Integer> {

    //JPA functions
    Tono findById(int id);

    //nat query
    @Query(nativeQuery = true, value = "select * from tono where tono.nombre = :nombre")
    public Tono findByNombre(@Param("nombre") String nombre);

    //deriv. query
    @Query("SELECT t FROM Tono t WHERE t.id= :id")
    public Tono findByPisoId(@Param("id") int id);
}
