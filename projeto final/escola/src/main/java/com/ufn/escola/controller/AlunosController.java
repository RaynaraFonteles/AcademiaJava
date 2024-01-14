
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

import com.ufn.escola.model.dto.request.AlunosRequestDTO;
import com.ufn.escola.model.dto.response.AlunosResponseDTO;
import com.ufn.escola.service.AlunosService;

import jakarta.validation.constraints.NotNull;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/escolas")
public class AlunosController {

	@Autowired
	private AlunosService AlunosService;

	@GetMapping("/{escola_id}/turmas/{turma_id}/alunos")
	public List<AlunosResponseDTO> findAll(@PathVariable(value = "escola_id") long escolaId,
			@PathVariable(value = "turma_id") Long turmaId) {
		return AlunosService.findAll(turmaId);
	}

	@GetMapping("/{escola_id}/turmas/{turma_id}/alunos/{aluno_id}")
	public AlunosResponseDTO findById(@PathVariable(value = "escola_id") @NotNull Long escolaId,
			@PathVariable(value = "turma_id") Long turmaId, @PathVariable(value = "aluno_id") Long alunosId) {
		return AlunosService.findById(turmaId, alunosId);
	}

	@PostMapping("/{escola_id}/turmas/{turma_id}/alunos")
	public String create(@RequestBody AlunosRequestDTO AlunosDTO, @PathVariable(value = "escola_id") Long escolaId,
			@PathVariable(value = "turma_id") Long turmaId) {
		return AlunosService.create(AlunosDTO, escolaId);
	}

	@PutMapping("/{escola_id}/turmas/{turma_id}/alunos")
	public AlunosResponseDTO update(@RequestBody AlunosRequestDTO Alunos,
			@PathVariable(value = "escola_id") Long escolaId, @PathVariable(value = "turma_id") Long turmaId) {
		return AlunosService.update(Alunos, escolaId);
	}

	@DeleteMapping("/{escola_id}/turmas/{turma_id}/alunos/{aluno_id}")
	public String delete(@PathVariable(value = "escola_id") @NotNull Long escolaId,
			@PathVariable(value = "turma_id") Long turmaId, @PathVariable(value = "aluno_id") Long alunosId) {
		try {
			AlunosService.delete(alunosId);
			return "Excluído com sucesso!";
		} catch (Exception e) {
			e.getMessage();
		}
		return "Turma não excluída!";
	}

}
