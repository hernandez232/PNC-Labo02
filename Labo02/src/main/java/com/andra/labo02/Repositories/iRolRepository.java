package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Rol;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iRolRepository extends iGenericRepository<Rol, Integer> {

    //JPA functions
    Rol findById(int id);

    //nat query
    @Query(nativeQuery = true, value = "select * from rol where rol.rol = :rol")
    public Rol findByRol(@Param("rol") String rol);

    //deriv. query
    @Query("SELECT r FROM Rol r WHERE r.id = :id")
    public Rol findByRolId(@Param("id") int id);
}
