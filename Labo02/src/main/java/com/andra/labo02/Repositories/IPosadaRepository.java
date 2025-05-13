package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Posada;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IPosadaRepository extends iGenericRepository<Posada, Integer> {

    //JPA functions
    public Posada findById(int id);

    //nat query
    @Query(nativeQuery = true, value = "select * from posada where posada.nombre = :nombre")
    public Posada findByNombre(@Param("nombre") String nombre);

    //deriv. query
    @Query("SELECT o FROM Posada o WHERE o.direccion = :direccion")
    public Posada findByDireccion(@Param("direccion") String direccion);
}
