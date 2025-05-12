package com.andra.labo02.Repositories;

import com.andra.labo02.entities.OrdenTrabajo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iOrdenTrabajoInterface extends iGenericRepository<OrdenTrabajo, Integer> {
    OrdenTrabajo findById(int id);

    //nat query
    @Query(nativeQuery = true, value = "select * from orden_trabajo where orden_trabajo.id_empleado = :empleado")
    public OrdenTrabajo findByEmpleado(@Param("empleado") String empleado);

    //deriv. query
    @Query("SELECT o FROM Posada o WHERE o.direccion = :direccion")
    public OrdenTrabajo findByRol(@Param("direccion") String direccion);
}
