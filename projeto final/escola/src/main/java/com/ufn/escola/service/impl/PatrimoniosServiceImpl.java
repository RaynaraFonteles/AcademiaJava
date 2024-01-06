package com.ufn.escola.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufn.escola.model.Escolas;
import com.ufn.escola.model.Patrimonios;
import com.ufn.escola.model.dto.request.PatrimoniosRequestDTO;
import com.ufn.escola.model.dto.response.PatrimoniosResponseDTO;
import com.ufn.escola.repository.EscolasRepository;
import com.ufn.escola.repository.PatrimoniosRepository;
import com.ufn.escola.service.PatrimoniosService;

@Service
public class PatrimoniosServiceImpl implements PatrimoniosService {

	@Autowired
	private PatrimoniosRepository patrimonioRepository;

	@Autowired
	private EscolasRepository escolaRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public List<PatrimoniosResponseDTO> findAll(long escolaId) {
		Optional<Escolas> escola = escolaRepository.findById(escolaId);
		if (escola.isPresent()) {
			return escola.get().getPatrimonios().stream().map(t -> mapper.map(t, PatrimoniosResponseDTO.class))
					.toList();
		}
		return null;
	}

	@Override
	public PatrimoniosResponseDTO findById(Long escolaId, Long patrimonioId) {
		Optional<Escolas> escola = escolaRepository.findById(escolaId);
		if (escola.isPresent()) {
			return mapper.map(escola.get().getPatrimonios().stream().filter(t -> t.getId() == patrimonioId)
					.collect(Collectors.toList()).get(0), PatrimoniosResponseDTO.class);
		}
		return null;
	}

	@Override
	public String create(PatrimoniosRequestDTO patrimonioDTO, long escolaId) {
		Optional<Escolas> escola = escolaRepository.findById(escolaId);
		if (escola.isPresent()) {
			Patrimonios patrimonio = new Patrimonios();
			patrimonio.setDescricao(patrimonioDTO.getDescricao());
			patrimonio.setNome(patrimonioDTO.getNome());
			patrimonio.setStatus(patrimonioDTO.getStatus());
			patrimonio.setCreateAt(LocalDate.now());
			patrimonio.setEscola(escola.get());
			escola.get().getPatrimonios().add(patrimonioRepository.save(patrimonio));
			return "Salvo com sucesso";
		}
		return null;
	}

	@Override
	public PatrimoniosResponseDTO update(PatrimoniosRequestDTO patrimonioDTO, long escolaId) {
		Optional<Escolas> escola = escolaRepository.findById(escolaId);
		if (escola.isPresent()) {
			Patrimonios patrimonio = new Patrimonios();
			patrimonio.setId(patrimonioDTO.getId());
			patrimonio.setDescricao(patrimonioDTO.getDescricao());
			patrimonio.setEscola(escola.get());
			patrimonio.setNome(patrimonioDTO.getNome());
			patrimonio.setStatus(patrimonioDTO.getStatus());
			patrimonio.setCreateAt(LocalDate.now());
			escola.get().getPatrimonios().add(patrimonioRepository.save(patrimonio));
			return mapper.map(patrimonio, PatrimoniosResponseDTO.class);
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		patrimonioRepository.deleteById(id);
	}
}