package com.eventoapp.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

/**
 * Convidado
 */
@Entity
public class Convidado implements Serializable {

    @Id
    @NotEmpty
    private String rg;

    @NotEmpty
    private String nomeConvidado;

    @ManyToOne
    private Evento evento;

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @return the evento
     */
    public Evento getEvento() {
        return evento;
    }

    /**
     * @param evento the evento to set
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    /**
     * @return the nomeConvidado
     */
    public String getNomeConvidado() {
        return nomeConvidado;
    }

    /**
     * @param nomeConvidado the nomeConvidado to set
     */
    public void setNomeConvidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

}