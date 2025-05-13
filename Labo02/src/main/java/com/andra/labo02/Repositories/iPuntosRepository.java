package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Persona;
import com.andra.labo02.Entities.Puntos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iPuntosRepository extends iGenericRepository<Puntos, Integer> {

    //JPA functions
    public Puntos findById(int id);
    public Puntos findByEmpleado(Persona empleado);

    //nat query
    @Query(nativeQuery = true, value = "select * from puntos where puntos.ultima_fecha_de_aplicacion = :ultimaAplicacion")
    public Puntos findByUltimaAplicacion(@Param("ultimaAplicacion") String ultimaAplicacion);

    //deriv. query
    @Query("SELECT p FROM Puntos p WHERE p.huesped.nombre = :nombre")
    public Puntos findByHuesped(@Param("nombre") String nombre);
}
