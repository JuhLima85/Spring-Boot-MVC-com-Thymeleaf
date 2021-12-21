package com.juhlima.repository;

import org.springframework.data.repository.CrudRepository;

import com.juhlima.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo(Long codigo);

}
