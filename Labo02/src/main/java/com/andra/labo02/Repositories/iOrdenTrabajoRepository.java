package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.OrdenTrabajo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iOrdenTrabajoRepository extends iGenericRepository<OrdenTrabajo, Integer> {

    //JPA functions
    OrdenTrabajo findById(int id);
    OrdenTrabajo findByHora(String hora);

    //nat query
    @Query(nativeQuery = true, value = "select * from orden_trabajo where orden_trabajo.fecha = :fecha")
    public OrdenTrabajo findByFecha(@Param("fecha") String fecha);

    //deriv. query
    @Query("SELECT o FROM OrdenTrabajo o WHERE o.empleado.nombre = :nombre")
    public OrdenTrabajo findByEmpleado(@Param("nombre") String nombre);
}
