package com.example.demo.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.domain.Demanda;
import com.example.demo.services.DemandaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api ( value = " API REST Produtos " )
public class DemandaResource {


	@Autowired
	private DemandaService service;
	

	@ApiOperation ( value = "Informa demanda por id" )
	@GetMapping("/demanda-cadastrada/{id}")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Demanda> find(@PathVariable Integer id) throws Exception {
		Demanda obj = service.find(id);
		return ResponseEntity.ok(obj);
	}
	
	@ApiOperation ( value = "Informa todas demandas cadastradas" )
	@GetMapping("/demandas-cadastradas/")
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Demanda>> findAll() {
		List<Demanda> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@ApiOperation ( value = "Cria uma nova demanda" )
	@PostMapping("/cadastrar-demanda")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Demanda obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
//	@ApiOperation ( value = "Deleta uma demanda" )
//	@DeleteMapping ( "/deletar-demanda/{id}" )
//	public  void  deletaDemanda ( @PathVariable Integer id ) throws Exception {
//		service.delete(id);
//	}
}
