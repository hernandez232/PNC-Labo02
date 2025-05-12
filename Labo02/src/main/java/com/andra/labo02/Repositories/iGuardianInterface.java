package com.andra.labo02.Repositories;

import com.andra.labo02.entities.Guardian;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iGuardianInterface extends iGenericRepository<Guardian, Integer> {
    Guardian findById(int id);

    @Query(nativeQuery = true, value = "select * from guardian where guardian.departamento = :departamento")
    public Guardian findByDepartamento(@Param("departamento") String departamento);

    //deriv. query
    @Query("SELECT g FROM Guardian g WHERE g.posada = :id_posada")
    public Guardian findByPosada(@Param("direccion") String direccion);

}
