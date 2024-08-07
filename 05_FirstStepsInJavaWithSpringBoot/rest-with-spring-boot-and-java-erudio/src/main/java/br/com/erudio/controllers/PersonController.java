package br.com.erudio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.erudio.model.Person;
import br.com.erudio.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonServices service;

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findById(@PathVariable(value = "id") Long id) throws Exception {

		return service.findById(id);
	}

	@PostMapping( consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Person create(@RequestBody Person person) throws Exception {

		return service.create(person);
	}

	@PutMapping( consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Person update(@RequestBody Person person) throws Exception {

		return service.update(person);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) throws Exception {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

	@GetMapping( produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findByAll() {
		return service.findAll();
	}

}
