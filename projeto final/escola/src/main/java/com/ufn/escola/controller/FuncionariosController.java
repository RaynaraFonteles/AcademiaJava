
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

import com.ufn.escola.model.dto.request.FuncionariosRequestDTO;
import com.ufn.escola.model.dto.response.FuncionariosResponseDTO;
import com.ufn.escola.service.FuncionariosService;

import jakarta.validation.constraints.NotNull;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

@RequestMapping("/escolas")
public class FuncionariosController {

	@Autowired
	private FuncionariosService FuncionariosService;

	
	@GetMapping("/{escola_id}/funcionarios")
	public List<FuncionariosResponseDTO> findAll(@PathVariable(value = "escola_id") long escolaId) {
		return FuncionariosService.findAll(escolaId);
	}

	@GetMapping("/{escola_id}/funcionarios/{funcionario_id}")
	public FuncionariosResponseDTO findById(@PathVariable(value = "escola_id") @NotNull Long escolaId,
			@PathVariable(value = "funcionario_id") Long funcionariosId) {
		return FuncionariosService.findById(escolaId, funcionariosId);
	}

	@PostMapping("/{escola_id}/funcionarios")
	public String create(@RequestBody FuncionariosRequestDTO FuncionariosDTO,
			@PathVariable(value = "escola_id") Long escolaId) {
		return FuncionariosService.create(FuncionariosDTO, escolaId);
	}

	@PutMapping("/{escola_id}/funcionarios")
	public FuncionariosResponseDTO update(@RequestBody FuncionariosRequestDTO Funcionarios,
			@PathVariable(value = "escola_id") Long escolaId) {
		return FuncionariosService.update(Funcionarios, escolaId);
	}

	@DeleteMapping("/{escola_id}/funcionarios/{funcionario_id}")
	public String delete(@PathVariable(value = "escola_id") @NotNull Long escolaId,
			@PathVariable(value = "funcionario_id") Long funcionariosId) {
		try {
			FuncionariosService.delete(funcionariosId);
			return "Excluído com sucesso!";
		} catch (Exception e) {
			e.getMessage();
		}
		return "Turma não excluída!";
	}

}
