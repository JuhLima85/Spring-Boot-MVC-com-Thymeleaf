package com.juhlima.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juhlima.models.Convidado;
import com.juhlima.models.Evento;

@Repository
public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
    Convidado findByRg(String rg);
}
