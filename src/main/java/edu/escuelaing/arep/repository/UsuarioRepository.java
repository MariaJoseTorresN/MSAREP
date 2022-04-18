package edu.escuelaing.arep.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.escuelaing.arep.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
    @Query("SELECT u FROM Usuario u WHERE name=:nombre")
    Optional<Usuario> findByName(@Param("nombre")String nombre);
}
