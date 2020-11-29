package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Demanda;
import com.example.demo.repository.DemandaRepository;

@Service
public class DemandaService {
	
	@Autowired
	private DemandaRepository repo;

	//@Autowired
	//private Producer producer;
	
	
	public Demanda insert(Demanda obj) {
		obj.setId(null);
		//producer.producer(obj);
		return repo.save(obj);
	}
	
	public Demanda find(Integer id) throws Exception {
		Optional<Demanda> obj = repo.findById(id);
		return obj.orElseThrow(() -> new Exception(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Demanda.class.getName()));
	}
	
	public List<Demanda> findAll(){
		return repo.findAll();
	}

}
