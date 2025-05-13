package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Recibo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iReciboRepository extends iGenericRepository<Recibo, Integer> {

    //JPA functions
    Recibo findById(int id);
    Recibo findByHora(String hora);

    // nat query
    @Query (nativeQuery = true, value = "select * from recibo where recibo.fecha = :fecha")
    Recibo findByFecha(@Param("fecha") String fecha);

    // deriv. query
    @Query("SELECT r FROM Recibo r WHERE r.reserva.id = :id")
    Recibo findByReservaId(@Param("id") int id);
}
