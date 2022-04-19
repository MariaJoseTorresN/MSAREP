package edu.escuelaing.arep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import edu.escuelaing.arep.model.Publicacion;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion,Long>{

}
