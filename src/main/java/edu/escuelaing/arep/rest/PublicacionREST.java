package edu.escuelaing.arep.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.escuelaing.arep.model.Publicacion;
import edu.escuelaing.arep.service.PublicacionService;

@RestController
@RequestMapping("/api/publicacion")
public class PublicacionREST {
    
    @Autowired
    private PublicacionService publicacionService;

    @PostMapping("/save")
    private ResponseEntity<Boolean> save(@RequestBody Publicacion publicacion) {
        try {
            publicacionService.createv(publicacion);
            return ResponseEntity.ok(true);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }        
    }
}
