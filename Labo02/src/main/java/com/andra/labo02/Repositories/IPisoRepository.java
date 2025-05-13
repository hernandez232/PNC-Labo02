package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Piso;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IPisoRepository {

    //JPA functions
    public Piso findById(int id);
    public Piso findByNombre(String nombre);

    //nat query
    @Query(nativeQuery = true, value = "select * from piso where piso.color = :color")
    public Piso findByColor(@Param("color") String color);

    //deriv. query
    @Query("SELECT o FROM Piso o WHERE o.tono.nombre = :nombre")
    public Piso findByTono(@Param("nombre") String nombre);
}
