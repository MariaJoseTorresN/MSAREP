package edu.escuelaing.arep.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.escuelaing.arep.model.Hilo;

@Repository
public interface HiloRepository extends JpaRepository<Hilo,Long>{
    
    @Query("SELECT h FROM Hilo h WHERE idUsuario=:id")
    List<Hilo> getByUserId(@Param("id")Long id);
    
}
