package com.ufn.escola.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufn.escola.model.Escolas;
import com.ufn.escola.model.dto.request.EscolasRequestDTO;
import com.ufn.escola.model.dto.response.EscolasResponseDTO;
import com.ufn.escola.repository.EscolasRepository;
import com.ufn.escola.service.EscolasService;

@Service
public class EscolasServiceImpl implements EscolasService {

	@Autowired
	private EscolasRepository escolaRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public List<EscolasResponseDTO> findAll() {

		return escolaRepository.findAll().stream().map(e -> mapper.map(e, EscolasResponseDTO.class)).toList();
	}

	@Override
	public EscolasResponseDTO findById(Long id) {

		Optional<Escolas> escola = escolaRepository.findById(id);
		if (escola.isPresent()) {
			return mapper.map(escola.get(), EscolasResponseDTO.class);
		}
		return null;
	}

	@Override
	public String create(EscolasRequestDTO escolaDTO) {
		Escolas escola = new Escolas();
		escola.setNome(escolaDTO.getNome());
		escola.setEndereco(escolaDTO.getEndereco());
		escola.setCreateAt(LocalDate.now());
		escola.setUpdateAt(LocalDate.now());
		escolaRepository.save(escola);
		return "Salvo com sucesso!";
	}

	@Override
	public EscolasResponseDTO update(EscolasRequestDTO escolaDTO) {
		Optional<Escolas> escola = escolaRepository.findById(escolaDTO.getId());
		if (escola.isPresent()) {
			escola.get().setNome(escolaDTO.getNome());
			escola.get().setEndereco(escolaDTO.getEndereco());
			escola.get().setUpdateAt(LocalDate.now());
			return mapper.map(escolaRepository.saveAndFlush(escola.get()), EscolasResponseDTO.class);
		}
		return null;
	}

	@Override
	public void delete(Long id) {

		escolaRepository.deleteById(id);

	}

}
