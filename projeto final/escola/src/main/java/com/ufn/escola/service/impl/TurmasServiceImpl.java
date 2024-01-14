package com.ufn.escola.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufn.escola.model.Escolas;
import com.ufn.escola.model.Turmas;
import com.ufn.escola.model.dto.request.TurmasRequestDTO;
import com.ufn.escola.model.dto.response.TurmasResponseDTO;
import com.ufn.escola.repository.EscolasRepository;
import com.ufn.escola.repository.TurmasRepository;
import com.ufn.escola.service.TurmasService;

@Service
public class TurmasServiceImpl implements TurmasService {
	
	@Autowired
	private TurmasRepository turmaRepository;
	
	@Autowired
	private EscolasRepository escolaRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public List<TurmasResponseDTO> findAll(Long escolaId) {
		
		Optional<Escolas> escola = escolaRepository.findById(escolaId);
		if(escola.isPresent()) {
			return escola.get().getTurma().stream().map(t -> mapper.map(t, TurmasResponseDTO.class)).toList();
		}
		return null;
	}

	@Override
	public TurmasResponseDTO findById(Long escolaId, Long turmaId) {
		Optional<Turmas> turma = turmaRepository.findById(turmaId);
		if(turma.isPresent()) {
			
			return mapper.map(turma.get(), TurmasResponseDTO.class);
		
		}
		return null;
	}

	@Override
	public String create(TurmasRequestDTO turmaDTO, long escolaId) {
		Optional<Escolas> escola = escolaRepository.findById(escolaId);
		if(escola.isPresent()) {
			Turmas turma = new Turmas();
			turma.setDescricao(turmaDTO.getDescricao());
			turma.setCreateAt(LocalDate.now());
			turma.setUpdateAt(LocalDate.now());
			turma.setEscola(escola.get());
			turma = turmaRepository.save(turma);
			return String.valueOf(turma.getId());
		}
		return null;
	}

	@Override
	public TurmasResponseDTO update(TurmasRequestDTO turmaDTO, long escolaId) {
		Optional<Escolas> escola = escolaRepository.findById(escolaId);
		if(escola.isPresent()) {
			Turmas turma = new Turmas();
			turma.setId(turmaDTO.getId());
			turma.setDescricao(turmaDTO.getDescricao());
			turma.setUpdateAt(LocalDate.now());
			turma.setEscola(escola.get());
			turma = turmaRepository.save(turma);
			return mapper.map(turma, TurmasResponseDTO.class);
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		turmaRepository.deleteById(id);
	}

}
