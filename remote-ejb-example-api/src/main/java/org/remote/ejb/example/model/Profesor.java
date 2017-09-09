package org.remote.ejb.example.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author rober
 */
@Entity
@Table(name = "Profesor")
public class Profesor implements Serializable {
    
    private int profesor_id;
    private String profesor_nombre;
    private String profesor_paterno;
    private String profesor_materno;
    
    private Distrito distrito;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public int getProfesor_id() {
        return profesor_id;
    }

    public void setProfesor_id(int profesor_id) {
        this.profesor_id = profesor_id;
    }

    @Column
    public String getProfesor_nombre() {
        return profesor_nombre;
    }

    public void setProfesor_nombre(String profesor_nombre) {
        this.profesor_nombre = profesor_nombre;
    }

    @Column
    public String getProfesor_paterno() {
        return profesor_paterno;
    }

    public void setProfesor_paterno(String profesor_paterno) {
        this.profesor_paterno = profesor_paterno;
    }

    @Column
    public String getProfesor_materno() {
        return profesor_materno;
    }

    public void setProfesor_materno(String profesor_materno) {
        this.profesor_materno = profesor_materno;
    }

    @ManyToOne
    @JoinColumn(name = "distrito_id")
    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }
    
}
