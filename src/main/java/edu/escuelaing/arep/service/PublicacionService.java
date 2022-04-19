package edu.escuelaing.arep.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.escuelaing.arep.model.Publicacion;
import edu.escuelaing.arep.repository.PublicacionRepository;

@Service
public class PublicacionService {
    
    @Autowired
    private PublicacionRepository publicacionRepository;

    public List<Publicacion> getAllPosts() {
        return publicacionRepository.findAll();
    }

}
