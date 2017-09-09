package org.remote.ejb.example.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author rober
 */
@Entity
@Table(name = "Distrito")
public class Distrito implements Serializable{
    
    public int distrito_id;
    public String distrito_nombre;

    public Distrito() {
    }

    public Distrito(int distrito_id, String distrito_nombre) {
        this.distrito_id = distrito_id;
        this.distrito_nombre = distrito_nombre;
    }
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public int getDistrito_id() {
        return distrito_id;
    }

    public void setDistrito_id(int distrito_id) {
        this.distrito_id = distrito_id;
    }

    @Column
    public String getDistrito_nombre() {
        return distrito_nombre;
    }

    public void setDistrito_nombre(String distrito_nombre) {
        this.distrito_nombre = distrito_nombre;
    }


    
}
