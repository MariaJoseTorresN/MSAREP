package edu.escuelaing.arep.model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Hilos")
public class Hilo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "IdUsuario", nullable = false)
    private Usuario idUsuario;
    @ManyToOne
    @JoinColumn(name = "IdPublicacion", nullable = false)
    private Publicacion idPublicacion;

    public Hilo(Long id, Usuario idUsuario, Publicacion idPublicacion) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idPublicacion = idPublicacion;
    }

    public Hilo(){}

    public Long getId() {
        return id;
    }
    public Publicacion getIdPublicacion() {
        return idPublicacion;
    }
    public Usuario getIdUsuario() {
        return idUsuario;
    }
    



}
