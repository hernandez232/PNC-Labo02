package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Ornamento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iOrnamentoRepository extends iGenericRepository<Ornamento, Integer> {

    //JPA functions
    public Ornamento findById(int id);
    public Ornamento findBySalonId(int id);

    //nat query
    @Query(nativeQuery = true, value = "select * from ornamento where ornamento.name = :nombre")
    public Ornamento findByNombre(@Param("nombre") String nombre);

    //deriv. query
    @Query("SELECT o FROM Ornamento o WHERE o.salon.capacidad = :capacidad")
    public Ornamento findBySalon(@Param("capacidad") int capacidad);
}
