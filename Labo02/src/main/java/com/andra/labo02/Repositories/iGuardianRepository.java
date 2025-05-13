package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Guardian;

import com.andra.labo02.Entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iGuardianRepository extends iGenericRepository<Guardian, Integer> {

    //JPA functions
    Guardian findById(int id);
    Guardian findByEmpleado(Persona empleado);

    //nat query
    @Query(nativeQuery = true, value = "select * from guardian where guardian.departamento = :departamento")
    public Guardian findByDepartamento(@Param("departamento") String departamento);

    //deriv. query
    @Query("SELECT g FROM Guardian g WHERE g.posada.nombre = :nombre")
    public Guardian findByPosada(@Param("nombre") String nombre);

}
