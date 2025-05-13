package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Estado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iEstadoRepository extends iGenericRepository<Estado, Integer> {

    //JPA functions
    Estado findById(int id);

    //nat query
    @Query(nativeQuery = true, value = "select * from estado where estado.estado = :estado")
    public Estado findByEstado(@Param("estado") String estado);

    //deriv. query
    @Query("SELECT e FROM Estado e WHERE e.id = :id")
    public Estado findByReservasId(@Param("id") Integer id);
}
