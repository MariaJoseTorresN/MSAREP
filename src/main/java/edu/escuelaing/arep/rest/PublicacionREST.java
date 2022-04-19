package edu.escuelaing.arep.rest;

import java.net.URI;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arep.model.Hilo;
import edu.escuelaing.arep.model.Publicacion;
import edu.escuelaing.arep.model.Usuario;
import edu.escuelaing.arep.service.HiloService;
import edu.escuelaing.arep.service.PublicacionService;
import edu.escuelaing.arep.service.UsuarioService;

@RestController
@RequestMapping("/api/publicacion")
public class PublicacionREST {
    
    @Autowired
    private PublicacionService publicacionService;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private HiloService hiloService;

    @PostMapping("/save")
    private ResponseEntity<Boolean> save(@RequestBody Publicacion publicacion) {
        try {
            publicacionService.createv(publicacion);
            return ResponseEntity.ok(true);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }        
    }
    @PostMapping("/create")
    private ResponseEntity<Publicacion> save(@PathParam("idUsuario")Long idUsuario, @PathParam("idHilo")Long idHilo) {
        try {
            Usuario usuario = usuarioService.findById(idUsuario).get();
            Hilo hilo = hiloService.findById(idHilo).get();
            Publicacion publicacion = new Publicacion(usuario, hilo, "");
            Publicacion post =  publicacionService.create(publicacion);
            return ResponseEntity.ok(post);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @PostMapping()
    private ResponseEntity<Hilo> hilos(@RequestBody Hilo hilo) {
        Hilo temp = hiloService.create(hilo);
        try {
            return ResponseEntity.created(new URI("/api/hilo"+temp.getId())).body(temp);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
