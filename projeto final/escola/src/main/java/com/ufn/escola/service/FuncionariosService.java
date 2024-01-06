package com.ufn.escola.service;

import java.util.List;

import com.ufn.escola.model.dto.request.FuncionariosRequestDTO;
import com.ufn.escola.model.dto.response.FuncionariosResponseDTO;

public interface FuncionariosService {

	List<FuncionariosResponseDTO> findAll(Long escolaId);

	FuncionariosResponseDTO findById(Long escolaId, Long funcionariosId);

	String create(FuncionariosRequestDTO funcionarios, long escolaId);

	FuncionariosResponseDTO update(FuncionariosRequestDTO funcionarios, long escolaId);

	void delete(Long id);

}
