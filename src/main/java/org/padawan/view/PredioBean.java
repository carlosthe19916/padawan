package org.padawan.view;

import org.padawan.service.PredioService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class PredioBean {

    @Inject
    PredioService predioService;

    public void llamarService() {
        this.predioService.llamarStoreProcedure();
    }

}