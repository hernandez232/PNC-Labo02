package com.andra.labo02.Repositories;

import com.andra.labo02.entities.Guardian;
import com.andra.labo02.entities.Habitacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iHabitacionInterface extends iGenericRepository<Habitacion, Integer> {
    Habitacion findById(int id);

    //nat query
    @Query(nativeQuery = true, value = "select * from habitacion where habitacion.nombre = :nombre")
    public Habitacion findByDepartamento(@Param("nombre") String nombre);

    //deriv. query
    @Query("SELECT h FROM Habitacion h WHERE h.piso = :id_piso")
    public Habitacion findByPosada(@Param("id_piso") int id_piso);
}
