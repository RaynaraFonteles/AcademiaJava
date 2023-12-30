package com.ufn.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ufn.escola.model.Escolas;
import com.ufn.escola.service.EscolaService;

@RestController
@RequestMapping("/escolas")
public class EscolaController {

	@Autowired
	private EscolaService escolaService;

	@GetMapping
	public List<Escolas> findAll() {
		return escolaService.findAll();
	}
	
	@GetMapping("/{id}")
	public Escolas findById(@RequestParam Long id) {
		return escolaService.findById(id);
	}
	
	@PostMapping
	public Escolas create(@RequestBody Escolas escola) {
		return escolaService.create(escola);
	}
	
	@PutMapping
	public Escolas update(@RequestBody Escolas escola) {
		return escolaService.update(escola);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@RequestParam Long id) {
		try {
			escolaService.delete(id);
			return "Excluído com sucesso!";
		}catch (Exception e) {
			e.getMessage();
		}
		return "Item não excluído!";
	}

}