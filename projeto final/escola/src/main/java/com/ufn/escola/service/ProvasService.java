package com.ufn.escola.service;

import java.util.List;

import com.ufn.escola.model.dto.request.ProvasRequestDTO;
import com.ufn.escola.model.dto.response.ProvasResponseDTO;

public interface ProvasService {

	List<ProvasResponseDTO> findAll(Long escolaId);

	ProvasResponseDTO findById(Long escolaId, Long provasId);

	String create(ProvasRequestDTO provas, long escolaId);

	ProvasResponseDTO update(ProvasRequestDTO provas, long escolaId);

	void delete(Long id);

}
