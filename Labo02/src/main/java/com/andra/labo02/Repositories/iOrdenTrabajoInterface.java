package com.andra.labo02.Repositories;

import com.andra.labo02.entities.Orden_trabajo;
import com.andra.labo02.entities.Posada;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iOrdenTrabajoInterface extends iGenericRepository<Orden_trabajo, Integer> {
    Orden_trabajo findById(int id);

    //nat query
    @Query(nativeQuery = true, value = "select * from orden_trabajo where orden_trabajo.empleado = :empleado")
    public Orden_trabajo findByEmpleado(@Param("empleado") String empleado);

    //deriv. query
    @Query("SELECT o FROM Posada o WHERE o.direccion = :direccion")
    public Orden_trabajo findByRol(@Param("direccion") String direccion);
}
