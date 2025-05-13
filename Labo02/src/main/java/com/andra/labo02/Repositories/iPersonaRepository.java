package com.andra.labo02.Repositories;

import com.andra.labo02.Entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iPersonaRepository extends JpaRepository<Persona, Integer> {

    //JPA functions
    public Persona findById(int id);
    public Persona findByCorreo(String correo);

    //native
    @Query(nativeQuery = true, value = "SELECT * FROM persona WHERE  persona.apellido = :apellido ")
    public Persona findByApellido(@Param("apellido") String apellido);

    //hibrid
    @Query("select p from Persona p where p.rol.rol = :rol")
    public Persona findPersonaByRol(@Param("rol") String rol);
}
