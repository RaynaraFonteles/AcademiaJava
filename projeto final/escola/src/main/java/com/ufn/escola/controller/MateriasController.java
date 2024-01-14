
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

import com.ufn.escola.model.dto.request.MateriasRequestDTO;
import com.ufn.escola.model.dto.response.MateriasResponseDTO;
import com.ufn.escola.service.MateriasService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/escolas")
public class MateriasController {

	@Autowired
	private MateriasService materiasService;

	
	@GetMapping("/{escola_id}/turmas/{turma_id}/materias")
	public List<MateriasResponseDTO> findAll(@PathVariable(value = "escola_id") long escolaId,
			@PathVariable(value = "turma_id") long turmaId) {
		return materiasService.findAll(escolaId, turmaId);
	}

	@GetMapping("/{escola_id}/turmas/{turma_id}/materias/{materia_id}")
	public MateriasResponseDTO findById(@PathVariable(value = "escola_id") long escolaId,
			@PathVariable(value = "turma_id") long turmaId, @PathVariable(value = "materia_id") Long materiasId) {
		return materiasService.findById(escolaId, turmaId, materiasId);
	}

	@PostMapping("/{escola_id}/turmas/{turma_id}/materias")
	public String create(@RequestBody MateriasRequestDTO MateriasDTO, @PathVariable(value = "escola_id") long escolaId,
			@PathVariable(value = "turma_id") long turmaId) {
		return materiasService.create(MateriasDTO, escolaId, turmaId);
	}

	@PutMapping("/{escola_id}/turmas/{turma_id}/materias")
	public MateriasResponseDTO update(@RequestBody MateriasRequestDTO Materias,
			@PathVariable(value = "escola_id") long escolaId, @PathVariable(value = "turma_id") long turmaId) {
		return materiasService.update(Materias, escolaId, turmaId);
	}

	@DeleteMapping("/{escola_id}/turmas/{turma_id}/materias/{materia_id}")
	public String delete(@PathVariable(value = "escola_id") long escolaId,
			@PathVariable(value = "turma_id") long turmaId, @PathVariable(value = "materia_id") Long materiasId) {
		try {
			materiasService.delete(escolaId, turmaId, materiasId);
			return "Excluído com sucesso!";
		} catch (Exception e) {
			e.getMessage();
		}
		return "Turma não excluída!";
	}

}
