package edu.escuelaing.arep.service;

import java.util.List;
import java.util.Optional;

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

    public Publicacion create (Publicacion publicacion){
        return publicacionRepository.save(publicacion);
    }

    public void delete(Publicacion publicacion) {
        publicacionRepository.delete(publicacion);
    }

    public Optional<Publicacion> findById(Long id) {
        return publicacionRepository.findById(id);
    }

    public List<Publicacion> findAllByIdUsuario(Long id) {
        return publicacionRepository.getAllByIdUsuario(id);
    }
}
