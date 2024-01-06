package com.ufn.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufn.escola.model.dto.request.TurmasRequestDTO;
import com.ufn.escola.model.dto.response.TurmasResponseDTO;
import com.ufn.escola.service.TurmasService;

import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping("/escolas")
public class TurmasController {

	@Autowired
	private TurmasService TurmaService;

	@GetMapping("/{escola_id}/turma")
	public List<TurmasResponseDTO> findAll(@PathVariable(value = "escola_id") long escolaId) {
		return TurmaService.findAll(escolaId);
	}

	@GetMapping("/{escola_id}/turma/{turma_id}")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public TurmasResponseDTO findById(@PathVariable(value = "escola_id") @NotNull Long escolaId,
			@PathVariable(value = "turma_id") Long turmaId) {
		return TurmaService.findById(escolaId, turmaId);
	}

	@PostMapping("/{escola_id}/turma")
	public String create(@RequestBody TurmasRequestDTO TurmaDTO, @PathVariable(value = "escola_id") Long escolaId) {
		return TurmaService.create(TurmaDTO, escolaId);
	}

	@PutMapping("/{escola_id}/turma")
	public TurmasResponseDTO update(@RequestBody TurmasRequestDTO Turma, @PathVariable(value = "escola_id") Long escolaId) {
		return TurmaService.update(Turma, escolaId);
	}

	@DeleteMapping("/{escola_id}/turma/{turma_id}")
	public String delete(@PathVariable(value = "escola_id") @NotNull Long escolaId, @PathVariable(value = "turma_id") Long turmaId) {
		try {
			TurmaService.delete(turmaId);
			return "Excluído com sucesso!";
		} catch (Exception e) {
			e.getMessage();
		}
		return "Turma não excluída!";
	}

}
