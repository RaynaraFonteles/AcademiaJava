package com.ufn.escola.service;

import java.util.List;

import com.ufn.escola.model.dto.request.EscolasRequestDTO;
import com.ufn.escola.model.dto.response.EscolasResponseDTO;

public interface EscolasService {
	
	List<EscolasResponseDTO> findAll();
	
	EscolasResponseDTO findById(Long id);
	
	String create(EscolasRequestDTO escola);
	
	EscolasResponseDTO update(EscolasRequestDTO escola);
	
	void delete(Long id);

}
