package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Reserva;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iReservaRepository extends iGenericRepository<Reserva, Integer> {

    //JPA functions
    Reserva findById(int id);
    Reserva findByFechaSalida(String fechaSalida);

    //nat query
    @Query(nativeQuery = true, value = "select * from reserva where reserva.fecha_de_entrada = :fechaEntrada")
    public Reserva findByFechaEntrada(@Param("fechaEntrada") String fechaEntrada);

    //deriv. query
    @Query("SELECT r FROM Reserva r WHERE r.estado.estado = :estado")
    public Reserva findByEstado(@Param("estado") String estado);
}
