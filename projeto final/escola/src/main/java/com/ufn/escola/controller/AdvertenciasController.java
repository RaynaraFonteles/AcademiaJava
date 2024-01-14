
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

import com.ufn.escola.model.dto.request.AdvertenciasRequestDTO;
import com.ufn.escola.model.dto.response.AdvertenciasResponseDTO;
import com.ufn.escola.service.AdvertenciasService;

import jakarta.validation.constraints.NotNull;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

@RequestMapping("/escolas")
public class AdvertenciasController {

	@Autowired
	private AdvertenciasService AdvertenciasService;

	
	@GetMapping("/{escola_id}/alunos/{aluno_id}/advertencias")
	public List<AdvertenciasResponseDTO> findAll(@PathVariable(value = "escola_id") long escolaId, @PathVariable(value = "aluno_id") long alunoId) {
		return AdvertenciasService.findAll(alunoId);
	}

	@GetMapping("/{escola_id}/alunos/{aluno_id}/advertencias/{advertencia_id}")
	public AdvertenciasResponseDTO findById(@PathVariable(value = "aluno_id") @NotNull Long alunoId,
			@PathVariable(value = "advertencia_id") Long advertenciasId) {
		return AdvertenciasService.findById(alunoId, advertenciasId);
	}

	@PostMapping("/{escola_id}/alunos/{aluno_id}/advertencias")
	public String create(@RequestBody AdvertenciasRequestDTO AdvertenciasDTO,
			@PathVariable(value = "escola_id") long escolaId, @PathVariable(value = "aluno_id") long alunoId) {
		return AdvertenciasService.create(AdvertenciasDTO, alunoId);
	}

	@PutMapping("/{escola_id}/alunos/{aluno_id}/advertencias")
	public AdvertenciasResponseDTO update(@RequestBody AdvertenciasRequestDTO Advertencias,
			@PathVariable(value = "escola_id") long escolaId, @PathVariable(value = "aluno_id") long alunoId) {
		return AdvertenciasService.update(Advertencias, alunoId);
	}

	@DeleteMapping("/{escola_id}/alunos/{aluno_id}/advertencias/{advertencias_id}")
	public String delete(@PathVariable(value = "escola_id") long escolaId, @PathVariable(value = "aluno_id") long alunoId,
			@PathVariable(value = "advertencias_id") Long advertenciasId) {
		try {
			AdvertenciasService.delete(advertenciasId);
			return "Excluído com sucesso!";
		} catch (Exception e) {
			e.getMessage();
		}
		return "Turma não excluída!";
	}

}
