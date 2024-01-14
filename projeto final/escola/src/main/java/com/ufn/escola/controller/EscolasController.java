package com.ufn.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufn.escola.model.dto.request.EscolasRequestDTO;
import com.ufn.escola.model.dto.response.EscolasResponseDTO;
import com.ufn.escola.service.EscolasService;

import jakarta.validation.constraints.NotNull;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/escolas")
public class EscolasController {

	@Autowired
	private EscolasService escolaService;

	@GetMapping
	public List<EscolasResponseDTO> findAll() {
		return escolaService.findAll();
	}

	@GetMapping("/{id}")
	public EscolasResponseDTO findById(@PathVariable(value = "id") @NotNull Long id) {
		return escolaService.findById(id);
	}

	@PostMapping
	public String create(@RequestBody EscolasRequestDTO escolaDTO) {

		return escolaService.create(escolaDTO);
	}

	@PutMapping
	public EscolasResponseDTO update(@RequestBody EscolasRequestDTO escola) {
		return escolaService.update(escola);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		try {
			escolaService.delete(id);
			return "Excluído com sucesso!";
		} catch (Exception e) {
			e.getMessage();
		}
		return "Item não excluído!";
	}

}