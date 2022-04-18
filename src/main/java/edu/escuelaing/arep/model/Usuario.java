package edu.escuelaing.arep.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuarios")
public class Usuario implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String password;

    public Usuario(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Usuario(){}

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
