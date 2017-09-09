package remote.ejb.example.service.impl;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import org.remote.ejb.example.model.Distrito;
import org.remote.ejb.example.service.DistritoServiceRemote;

/**
 *
 * @author rober
 */
@Remote(DistritoServiceRemote.class)
@Stateless
public class DistritoService implements DistritoServiceRemote{
    
    @PersistenceContext
    private EntityManager em;


    @Override
    public Distrito create(Distrito t) {
        em.persist(t);
        return t;
    }

    @Override
    public Distrito read(Serializable id) {
        return em.find(Distrito.class, id);
    }

    @Override
    public Distrito update(Distrito t) {
        return em.merge(t);
    }

    @Override
    public void delete(Distrito t) {
        Distrito bean = em.merge(t);
        em.remove(bean);
    }

    @Override
    public List<Distrito> getAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Distrito.class));
        return em.createQuery(cq).getResultList();
    }
    
}
