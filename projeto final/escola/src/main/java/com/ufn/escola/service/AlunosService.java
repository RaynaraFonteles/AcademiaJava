package com.ufn.escola.service;

import java.util.List;

import com.ufn.escola.model.dto.request.AlunosRequestDTO;
import com.ufn.escola.model.dto.response.AlunosResponseDTO;

public interface AlunosService {

	List<AlunosResponseDTO> findAll(long escolaId);

	AlunosResponseDTO findById(Long escolaId, Long alunosId);

	String create(AlunosRequestDTO alunosDTO, Long escolaId);

	AlunosResponseDTO update(AlunosRequestDTO alunos, Long escolaId);

	void delete(Long alunosId);

}
