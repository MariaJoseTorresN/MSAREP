package edu.escuelaing.arep.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Publicaciones")
public class Publicacion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "IdUsuario", nullable = false)
    private Usuario idUsuario;
    @ManyToOne
    @JoinColumn(name = "IdHilo", nullable = false)
    private Hilo idHilo;
    @Column(name = "Texto")
    private String texto;
    @Column(name = "CreationDate", nullable = false)
    private Date creationDate;

    public Publicacion(Usuario idUsuario, Hilo idHilo,String texto){
        this.idUsuario = idUsuario;
        this.idHilo = idHilo;
        this.texto = texto;
        this.creationDate = new Date();
    }

    public Publicacion(Long id, Usuario idUsuario, Hilo idHilo, String texto){
        this.id = id;
        this.idUsuario = idUsuario;
        this.idHilo = idHilo;
        this.texto = texto;
        this.creationDate = new Date();
    }

    public Publicacion(){}

    public Long getId() {
        return id;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public Usuario getIdUsuario() {
        return idUsuario;
    }
    public Hilo getIdHilo() {
        return idHilo;
    }
    public String getTexto() {
        return texto;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
}
