package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Habitacion;
import com.andra.labo02.Entities.Piso;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iHabitacionInterface extends iGenericRepository<Habitacion, Integer> {

    //JPA functions
    Habitacion findById(int id);
    Habitacion findByPiso(Piso piso);

    //nat query
    @Query(nativeQuery = true, value = "select * from habitacion where habitacion.nombre = :nombre")
    public Habitacion findByDepartamento(@Param("nombre") String nombre);

    //deriv. query
    @Query("SELECT h FROM Habitacion h WHERE h.piso.nombre = :nombre")
    public Habitacion findByPosada(@Param("nombre") int nombre);
}
