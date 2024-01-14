package com.ufn.escola.service;

import java.util.List;

import com.ufn.escola.model.dto.request.ProvasRequestDTO;
import com.ufn.escola.model.dto.response.ProvasResponseDTO;

public interface ProvasService {

	List<ProvasResponseDTO> findAll(Long materiaId);

	ProvasResponseDTO findById(Long materiaId, Long provaId);

	String create(ProvasRequestDTO provas, long materiaId, long turmaId);

	ProvasResponseDTO update(ProvasRequestDTO provas, long materiaId, long turmaId);

	void delete(Long provaId);

}
