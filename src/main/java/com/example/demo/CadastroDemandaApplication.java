package com.example.demo;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Demanda;
import com.example.demo.domain.EnderecoDestino;
import com.example.demo.domain.EnderecoOrigem;
import com.example.demo.domain.enums.TipoCarga;
import com.example.demo.repository.DemandaRepository;

@SpringBootApplication
public class CadastroDemandaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CadastroDemandaApplication.class, args);
	}
	
	@Autowired
	private DemandaRepository demandaRepository;
	
	
	@Override
	public void run(String...args) throws ParseException {
		
		EnderecoOrigem  enderecoOrigem = new EnderecoOrigem("apto", "198", "xxxx", "zzzzz", "sssss", "sssss", "sssss");
		EnderecoDestino  enderecoDestino = new EnderecoDestino(null, "apto", "198", "xxxx", "zzzzz", "sssss", "sssss", "sss");
		
//		Demanda demanda1 = new Demanda(null, "sss", "aaaaa", "aaaaaa", TipoCarga.CARGA_VIVA);
//		
//		demanda1.setEnderecoOrigem(enderecoOrigem);
//		demanda1.setEnderecoDestino(enderecoDestino);
//		
//		demandaRepository.save(demanda1);
		
		
		
		
	}

}
