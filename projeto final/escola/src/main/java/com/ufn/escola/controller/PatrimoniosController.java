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

import com.ufn.escola.model.dto.request.PatrimoniosRequestDTO;
import com.ufn.escola.model.dto.response.PatrimoniosResponseDTO;
import com.ufn.escola.service.PatrimoniosService;

import jakarta.validation.constraints.NotNull;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/escolas")
public class PatrimoniosController {

	@Autowired
	private PatrimoniosService PatrimonioService;

	
	@GetMapping("/{escola_id}/patrimonio")
	public List<PatrimoniosResponseDTO> findAll(@PathVariable(value = "escola_id") long escolaId) {
		return PatrimonioService.findAll(escolaId);
	}

	@GetMapping("/{escola_id}/patrimonio/{patrimonio_id}")
	public PatrimoniosResponseDTO findById(@PathVariable(value = "escola_id") @NotNull Long escolaId,
			@PathVariable(value = "patrimonio_id") Long patrimonioId) {
		return PatrimonioService.findById(escolaId, patrimonioId);
	}

	@PostMapping("/{escola_id}/patrimonio")
	public String create(@RequestBody PatrimoniosRequestDTO PatrimonioDTO,
			@PathVariable(value = "escola_id") Long escolaId) {
		return PatrimonioService.create(PatrimonioDTO, escolaId);
	}

	@PutMapping("/{escola_id}/patrimonio")
	public PatrimoniosResponseDTO update(@RequestBody PatrimoniosRequestDTO Patrimonio,
			@PathVariable(value = "escola_id") Long escolaId) {
		return PatrimonioService.update(Patrimonio, escolaId);
	}

	@DeleteMapping("/{escola_id}/patrimonio/{patrimonio_id}")
	public String delete(@PathVariable(value = "escola_id") @NotNull Long escolaId,
			@PathVariable(value = "patrimonio_id") Long patrimonioId) {
		try {
			PatrimonioService.delete(patrimonioId);
			return "Excluído com sucesso!";
		} catch (Exception e) {
			e.getMessage();
		}
		return "Patrimônio não excluído!";
	}

}
