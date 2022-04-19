package edu.escuelaing.arep.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Publicaciones")
public class Publicacion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="Author")
    private String author;
    @Column(name="Titulo")
    private String titulo;
    @Column(name = "Texto")
    private String texto;

    public Publicacion(){}

    public Publicacion(Long id, String author, String titulo, String texto) {
        this.id = id;
        this.author = author;
        this.titulo = titulo;
        this.texto = texto;
    }
    public Publicacion(String author, String titulo, String texto) {
        this.author = author;
        this.titulo = titulo;
        this.texto = texto;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }


}
