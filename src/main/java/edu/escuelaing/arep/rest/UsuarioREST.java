package edu.escuelaing.arep.rest;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arep.model.Usuario;
import edu.escuelaing.arep.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioREST {
    
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    private ResponseEntity<Optional<Usuario>> postUsersByName(@PathParam("name")String name) {
        Optional<Usuario> usuario = usuarioService.findByName(name);
        return ResponseEntity.ok(usuario);
    }
}
