package com.ufn.escola.service;

import java.util.List;

import com.ufn.escola.model.Escolas;

public interface EscolaService {
	
	List<Escolas> findAll();
	Escolas findById(Long id);
	Escolas create(Escolas escola);
	Escolas update(Escolas escola);
	void delete(Long id);

}
