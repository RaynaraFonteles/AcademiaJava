
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

import com.ufn.escola.model.dto.request.ProvasRequestDTO;
import com.ufn.escola.model.dto.response.ProvasResponseDTO;
import com.ufn.escola.service.ProvasService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

@RequestMapping("/escolas")
public class ProvasController {

	@Autowired
	private ProvasService ProvasService;

	
	@GetMapping("/{escola_id}/turmas/{turma_id}/materias/{materia_id}/provas")
	public List<ProvasResponseDTO> findAll(@PathVariable(value = "escola_id") long escolaId, @PathVariable(value = "turma_id") long turmaId,
			@PathVariable(value = "materia_id") Long materiaId) {
		return ProvasService.findAll(materiaId);
	}

	@GetMapping("/{escola_id}/turmas/{turma_id}/materias/{materia_id}/provas/{prova_id}")
	public ProvasResponseDTO findById(@PathVariable(value = "escola_id") long escolaId, @PathVariable(value = "turma_id") long turmaId,
			@PathVariable(value = "materia_id") Long materiaId,
			@PathVariable(value = "prova_id") Long provasId) {
		return ProvasService.findById(materiaId, provasId);
	}

	@PostMapping("/{escola_id}/turmas/{turma_id}/materias/{materia_id}/provas")
	public String create(@RequestBody ProvasRequestDTO ProvasDTO, @PathVariable(value = "escola_id") long escolaId, @PathVariable(value = "turma_id") long turmaId,
			@PathVariable(value = "materia_id") Long materiaId) {
		return ProvasService.create(ProvasDTO, materiaId, turmaId);
	}

	@PutMapping("/{escola_id}/turmas/{turma_id}/materias/{materia_id}/provas")
	public ProvasResponseDTO update(@RequestBody ProvasRequestDTO Provas,
			@PathVariable(value = "escola_id") long escolaId, @PathVariable(value = "turma_id") long turmaId,
			@PathVariable(value = "materia_id") Long materiaId) {
		return ProvasService.update(Provas, materiaId, turmaId);
	}

	@DeleteMapping("/{escola_id}/turmas/{turma_id}/materias/{materia_id}/provas/{prova_id}")
	public String delete(@PathVariable(value = "escola_id") long escolaId, @PathVariable(value = "turma_id") long turmaId,
			@PathVariable(value = "materia_id") Long materiaId,
			@PathVariable(value = "prova_id") Long provasId) {
		try {
			ProvasService.delete(provasId);
			return "Excluído com sucesso!";
		} catch (Exception e) {
			e.getMessage();
		}
		return "Turma não excluída!";
	}

}
