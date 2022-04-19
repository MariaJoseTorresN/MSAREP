package edu.escuelaing.arep.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.escuelaing.arep.model.Publicacion;
import edu.escuelaing.arep.repository.PublicacionRepository;

@Service
public class PublicacionService {
    
    @Autowired
    private PublicacionRepository publicacionRepository;

    public void createv(Publicacion publicacion) {
        publicacionRepository.save(publicacion);
    }

}
