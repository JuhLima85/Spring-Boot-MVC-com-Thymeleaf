package com.juhlima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.juhlima.models.Convidado;
import com.juhlima.repository.ConvidadoRepository;


@SpringBootTest
class SpringThymeleafApplicationTests {
	
	@Autowired
	private ConvidadoRepository convrep;

	@Test
	void contextLoads() {
		Convidado cr = new Convidado();
		cr.setNomeConvidado("Ernilson");
		cr.setRg("DF 8888888");
		cr.setEvento(cr.getEvento());
		
		convrep.save(cr);
	}

}
