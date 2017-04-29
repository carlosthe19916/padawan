package org.padawan.service;

import org.padawan.model.PredioEntity;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

@Stateless
public class PredioService {

    @PersistenceContext
    private EntityManager em;

    public void llamarStoreProcedure() {
        StoredProcedureQuery q = this.em.createNamedStoredProcedureQuery("predioEmerson");
        q.setParameter(1, 1);
        q.setParameter(2, "20170405");
        List<PredioEntity> reviews = q.getResultList();

//        List<PredioEntity> predios = (List<PredioEntity>) this.em.createNamedStoredProcedureQuery("predioEmerson").getResultList();
        for (PredioEntity predio : reviews) {
            System.out.println(predio);
        }
    }

}
