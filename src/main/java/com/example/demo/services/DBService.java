package com.example.demo.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Demanda;
import com.example.demo.domain.TipoCarga;
import com.example.demo.repository.DemandaRepository;


@Service
public class DBService {

	

	
	@Autowired
	private DemandaRepository demandaRepository;

	public void instantiateTestDataBase() throws ParseException {
		
		
		
		
DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");

		
		Demanda demanda1 = new Demanda(null, "Rafael Campos", "teste@teste.com", "36709295848", TipoCarga.CARGA_VIVA, "casa", "125", "casa",
				"centro", "09850010", "09870440", "diadema", "sao paulo", "casa",
				"casa", "centro", "09850101", "sao paulo",
				"rio", dt.parse("20/12/2020"), dt.parse("01/01/2021"), 15.500, "974196599");

		
		demandaRepository.save(demanda1);
		
		
		

		
		
	}

}
