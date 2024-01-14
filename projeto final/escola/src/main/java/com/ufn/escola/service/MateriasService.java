package com.ufn.escola.service;

import java.util.List;

import com.ufn.escola.model.dto.request.MateriasRequestDTO;
import com.ufn.escola.model.dto.response.MateriasResponseDTO;

public interface MateriasService {

	List<MateriasResponseDTO> findAll(long escolaId, long turmaId);

	MateriasResponseDTO findById(long escolaId, long turmaId, Long materiaId);

	String create(MateriasRequestDTO materias, long escolaId, long turmaId);

	MateriasResponseDTO update(MateriasRequestDTO Materias, long escolaId, long turmaId);

	void delete(long escolaId, long turmaId, Long materiaId);

}
