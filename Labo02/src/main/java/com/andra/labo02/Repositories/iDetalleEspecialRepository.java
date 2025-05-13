package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.DetalleEspecial;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iDetalleEspecialRepository extends iGenericRepository<DetalleEspecial, Integer> {

    //JPA functions
    public DetalleEspecial findById(int id);
    public DetalleEspecial findByNombre(String nombre);

    //nat query
    @Query(nativeQuery = true, value = "select * from detalle_especial where detalle_especial.nombre = :nombre")
    public DetalleEspecial findByIdDetalle(@Param("nombre") String nombre);

    //deriv. query
    @Query("SELECT d FROM DetalleEspecial d WHERE d.habitacion.nombre = :nombre")
    public DetalleEspecial findById(@Param("nombre") String nombre);
}
