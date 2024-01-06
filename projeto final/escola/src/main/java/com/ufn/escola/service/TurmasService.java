package com.ufn.escola.service;

import java.util.List;

import com.ufn.escola.model.dto.request.TurmasRequestDTO;
import com.ufn.escola.model.dto.response.TurmasResponseDTO;

public interface TurmasService {

	List<TurmasResponseDTO> findAll(Long escolaId);
	
	TurmasResponseDTO findById(Long escolaId, Long turmaId);
	
	String create(TurmasRequestDTO turma, long escolaId);
	
	TurmasResponseDTO update(TurmasRequestDTO turma, long escolaId);
	
	void delete(Long id);
	
}
