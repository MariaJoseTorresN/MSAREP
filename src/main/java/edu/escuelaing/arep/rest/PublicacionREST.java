package edu.escuelaing.arep.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arep.model.Publicacion;
import edu.escuelaing.arep.service.PublicacionService;

@RestController
@RequestMapping("/api/publicacion")
public class PublicacionREST {
    
    @Autowired
    private PublicacionService publicacionService;

    @GetMapping
    private ResponseEntity<?> getAllPost() {
        try {
            List<Publicacion> publicaciones = publicacionService.getAllPosts();
            return new ResponseEntity<>(publicaciones, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error cargar todas las publicaciones", HttpStatus.NOT_FOUND);
        }
    }
}
