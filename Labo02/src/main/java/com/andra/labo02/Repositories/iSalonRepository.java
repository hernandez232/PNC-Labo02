package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Salon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iSalonRepository extends iGenericRepository<Salon, Integer> {

    //JPA functions
    Salon findById(int id);
    Salon findByDisponibilidad(Boolean disponibilidad);

    //nat. query
    @Query(nativeQuery = true, value = "select * from salon where salon.capacidad = :capacidad")
    public Salon findByCapacidad(@Param("capacidad") int capacidad);

    //deriv. query
    @Query("SELECT s FROM Salon s WHERE s.posada.nombre = :nombre")
    public Salon findByPosada(@Param("nombre") String nombre);
}
