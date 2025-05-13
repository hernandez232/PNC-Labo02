package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Rotacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iRotacionRepository extends iGenericRepository<Rotacion, Integer> {

    //JPA functions
    Rotacion findById(int id);
    Rotacion findByMes(String mes);

    //nat query
    @Query(nativeQuery = true, value = "select * from rotacion where rotacion.turno = :turno")
    public Rotacion findByTurno(@Param("turno") String turno);

    //deriv. query
    @Query("SELECT r FROM Rotacion r WHERE r.piso.color = :color")
    public Rotacion findByColorPiso(@Param("color") String color);
}
