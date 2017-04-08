package org.padawan.view;

import org.padawan.service.PredioService;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
@ManagedBean
public class PredioBean {

    private String title = "Hola";

    @Inject
    PredioService predioService;

    public void llamarService() {
        System.out.println("Entro al PREDIO BEAN");
        this.predioService.llamarStoreProcedure();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}