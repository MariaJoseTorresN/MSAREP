package edu.escuelaing.arep.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.escuelaing.arep.model.Usuario;
import edu.escuelaing.arep.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario create (Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void delete(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }
    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    public Optional<Usuario> findByName(String name) {
        return usuarioRepository.findByName(name);
    }
}
