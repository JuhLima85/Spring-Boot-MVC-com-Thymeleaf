package com.juhlima.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.juhlima.models.Convidado;
import com.juhlima.repository.ConvidadoRepository;

public class ConvidadoServiceImplement implements ConvidadoService{
	
	@Autowired
	private ConvidadoRepository convrep;

	@Override
	public Convidado salvar(Convidado cv) {
		// TODO Auto-generated method stub
		return convrep.save(cv);
	}

}
