package com.ufn.escola.service;

import java.util.List;

import com.ufn.escola.model.dto.request.PatrimoniosRequestDTO;
import com.ufn.escola.model.dto.response.PatrimoniosResponseDTO;

public interface PatrimoniosService {

	List<PatrimoniosResponseDTO> findAll(long escolaId);

	PatrimoniosResponseDTO findById(Long escolaId, Long patrimonioId);

	String create(PatrimoniosRequestDTO patrimonio, long escolaId);

	PatrimoniosResponseDTO update(PatrimoniosRequestDTO patrimonio, long escolaId);

	void delete(Long id);

}
