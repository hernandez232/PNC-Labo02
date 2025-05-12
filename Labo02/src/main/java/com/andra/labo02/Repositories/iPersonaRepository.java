package com.andra.labo02.Repositories;

import com.andra.labo02.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iPersonaRepository extends JpaRepository<Persona, Integer> {
    public Persona findById(int id);

    public Persona findByCorreo(String correo);
    //native
    @Query(nativeQuery = true, value = "SELECT * FROM persona WHERE  persona.apellidp = :apellido ")
    public Persona findByApellido(@Param("apellido") String apellido);
    //hibrid
    @Query("select p from Persona p where p.correo = :correo")
    public Persona findPersonaByCorreo(@Param("correo") String correo);
}
