package org.padawan.service;

import org.padawan.model.PredioEntity;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@EJB
public class PredioService {

    @PersistenceContext
    private EntityManager em;

    public void llamarStoreProcedure() {
        List<PredioEntity> predios = (List<PredioEntity>) this.em.createNamedStoredProcedureQuery("predioEmerson").getResultList();
        for (PredioEntity predio : predios) {
            System.out.println(predio);
        }
    }

}
