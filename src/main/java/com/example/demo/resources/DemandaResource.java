package com.example.demo.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.domain.Demanda;
import com.example.demo.services.DemandaService;

@RestController
@RequestMapping(value="/cadastro-demanda")
public class DemandaResource {


	@Autowired
	private DemandaService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Demanda> find(@PathVariable Integer id) throws Exception {
		Demanda obj = service.find(id);
		return ResponseEntity.ok(obj);
	}


	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Demanda>> findAll() {
		List<Demanda> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Demanda obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
