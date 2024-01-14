package com.ufn.escola.service;

import java.util.List;

import com.ufn.escola.model.dto.request.AdvertenciasRequestDTO;
import com.ufn.escola.model.dto.response.AdvertenciasResponseDTO;

public interface AdvertenciasService {

	List<AdvertenciasResponseDTO> findAll(Long alunosId);

	AdvertenciasResponseDTO findById(Long alunosId, Long advertenciasId);

	String create(AdvertenciasRequestDTO advertencias, long alunosId);

	AdvertenciasResponseDTO update(AdvertenciasRequestDTO advertencias, long alunosId);

	void delete(Long id);

}
