package edu.escuelaing.arep.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.escuelaing.arep.model.Hilo;
import edu.escuelaing.arep.repository.HiloRepository;


@Service
public class HiloService {
    
    @Autowired
    private HiloRepository hiloRepository;

    public Hilo create (Hilo hilo) {
        return hiloRepository.save(hilo);
    }

    public void delete (Hilo hilo) {
        hiloRepository.delete(hilo);
    }

    public Optional<Hilo> findById(Long id) {
        return hiloRepository.findById(id);
    }
    public List<Hilo> findByIdUsuario (Long id) {
        return hiloRepository.getByUserId(id);
    }
}
