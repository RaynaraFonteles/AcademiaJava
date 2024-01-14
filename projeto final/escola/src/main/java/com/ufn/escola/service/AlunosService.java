package com.ufn.escola.service;

import java.util.List;

import com.ufn.escola.model.dto.request.AlunosRequestDTO;
import com.ufn.escola.model.dto.response.AlunosResponseDTO;

public interface AlunosService {

	List<AlunosResponseDTO> findAll(long turmaId);

	AlunosResponseDTO findById(Long turmaId, Long alunoId);

	String create(AlunosRequestDTO alunosDTO, Long turmaId);

	AlunosResponseDTO update(AlunosRequestDTO alunos, Long turmaId);

	void delete(Long alunosId);

}
