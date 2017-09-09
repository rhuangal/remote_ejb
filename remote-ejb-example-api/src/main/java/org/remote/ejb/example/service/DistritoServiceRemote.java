package org.remote.ejb.example.service;

import java.io.Serializable;
import java.util.List;
import org.remote.ejb.example.model.Distrito;

/**
 *
 * @author rober
 */
public interface DistritoServiceRemote {
    
    public Distrito create(Distrito t);
    public Distrito read(Serializable id);
    public Distrito update(Distrito t);
    public void delete(Distrito t); 
    public List<Distrito> getAll();
    
}
