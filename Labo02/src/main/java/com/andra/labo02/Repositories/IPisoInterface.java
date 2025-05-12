package com.andra.labo02.Repositories;

import com.andra.labo02.entities.Piso;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IPisoInterface {
    public Piso findById(int id);

    @Query(nativeQuery = true, value = "select * from piso where piso.color = :color")
    public Piso findByColor(@Param("color") String color);

    //deriv. query
    @Query("SELECT o FROM Piso o WHERE o.tono = :tono")
    public Piso findByRol(@Param("tono") String tono);
}
