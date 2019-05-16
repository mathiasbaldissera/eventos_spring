package com.eventoapp.repository;

import com.eventoapp.models.Convidado;
import com.eventoapp.models.Evento;

import org.springframework.data.repository.CrudRepository;

/**
 * ConvidadoRepository
 */
public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
    Iterable<Convidado> findByEvento(Evento evento);

}