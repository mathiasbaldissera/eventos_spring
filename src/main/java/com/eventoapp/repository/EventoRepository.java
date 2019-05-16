package com.eventoapp.repository;

import com.eventoapp.models.Evento;

import org.springframework.data.repository.CrudRepository;

/**
 * EventoRepository
 */
public interface EventoRepository extends CrudRepository<Evento, String> {

    Evento findByCodigo(long codigo);
}