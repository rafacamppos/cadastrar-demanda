package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Demanda;
import com.example.demo.services.DemandaService;

@RestController
@RequestMapping(value="/cadastro-demanda")
public class DemandaResource {
	
	
	@Autowired
	private DemandaService service;
	
	@RequestMapping(value= "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Demanda> find(@PathVariable Integer id) throws Exception{
		Demanda obj = service.find(id);
		return ResponseEntity.ok(obj);
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List <Demanda>> findAll(){
		List<Demanda> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
