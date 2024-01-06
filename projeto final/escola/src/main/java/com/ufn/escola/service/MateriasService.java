package com.ufn.escola.service;

import java.util.List;

import com.ufn.escola.model.dto.request.MateriasRequestDTO;
import com.ufn.escola.model.dto.response.MateriasResponseDTO;

public interface MateriasService {

	List<MateriasResponseDTO> findAll(Long escolaId);

	MateriasResponseDTO findById(Long escolaId, Long materiasId);

	String create(MateriasRequestDTO materias, long escolaId);

	MateriasResponseDTO update(MateriasRequestDTO Materias, long escolaId);

	void delete(Long id);

}
