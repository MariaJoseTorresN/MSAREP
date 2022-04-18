package edu.escuelaing.arep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import edu.escuelaing.arep.model.Publicacion;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion,Long>{
    
    @Query("SELECT p FROM Publicacion p WHERE idUsuario=:id")
    List<Publicacion> getAllByIdUsuario(@Param("id") Long id);
}
