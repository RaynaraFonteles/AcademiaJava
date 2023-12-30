package com.ufn.escola.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufn.escola.model.Escolas;
import com.ufn.escola.repository.EscolaRepository;
import com.ufn.escola.service.EscolaService;

@Service
public class EscolaServiceImpl implements EscolaService {
	
	@Autowired
	private EscolaRepository escolaRepository; 

	@Override
	public List<Escolas> findAll() {
		// TODO Auto-generated method stub
		return escolaRepository.findAll();
	}

	@Override
	public Escolas findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Escolas> escola = escolaRepository.findById(id);
		if(escola.isPresent()) {
			return escola.get();
		}
		return null;
	}

	@Override
	public Escolas create(Escolas escola) {
		// TODO Auto-generated method stub
		return escolaRepository.save(escola);
	}

	@Override
	public Escolas update(Escolas escola) {
		// TODO Auto-generated method stub
		escola.setUpdateAt(LocalDate.now());
		return escolaRepository.saveAndFlush(escola);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		escolaRepository.deleteById(id);
		
	}



}
