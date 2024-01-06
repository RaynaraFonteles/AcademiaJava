package com.ufn.escola.service;

import java.util.List;

import com.ufn.escola.model.dto.request.AdvertenciasRequestDTO;
import com.ufn.escola.model.dto.response.AdvertenciasResponseDTO;

public interface AdvertenciasService {

	List<AdvertenciasResponseDTO> findAll(Long escolaId);

	AdvertenciasResponseDTO findById(Long escolaId, Long advertenciasId);

	String create(AdvertenciasRequestDTO advertencias, long escolaId);

	AdvertenciasResponseDTO update(AdvertenciasRequestDTO advertencias, long escolaId);

	void delete(Long id);

}
