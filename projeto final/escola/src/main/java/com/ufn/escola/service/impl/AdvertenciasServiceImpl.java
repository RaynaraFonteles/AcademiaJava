
package com.ufn.escola.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufn.escola.model.Advertencias;
import com.ufn.escola.model.Alunos;
import com.ufn.escola.model.dto.request.AdvertenciasRequestDTO;
import com.ufn.escola.model.dto.response.AdvertenciasResponseDTO;
import com.ufn.escola.repository.AdvertenciasRepository;
import com.ufn.escola.repository.AlunosRepository;
import com.ufn.escola.service.AdvertenciasService;

@Service
public class AdvertenciasServiceImpl implements AdvertenciasService {

	@Autowired
	private AdvertenciasRepository advertenciaRepository;

	@Autowired
	private AlunosRepository alunosRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public List<AdvertenciasResponseDTO> findAll(Long alunosId) {
		Optional<Alunos> aluno = alunosRepository.findById(alunosId);
		if (!aluno.isPresent()) {
			return new ArrayList<>();
		}
		List<Advertencias> advertencia = advertenciaRepository.findByAlunoId(aluno.get());
		if (!advertencia.isEmpty()) {
			return advertencia.stream().map(t -> mapper.map(t, AdvertenciasResponseDTO.class)).toList();
		}
		return new ArrayList<>();

	}

	@Override
	public AdvertenciasResponseDTO findById(Long alunosId, Long advertenciaId) {

		Optional<Advertencias> advertencia = advertenciaRepository.findById(advertenciaId);
		if (advertencia.isPresent()) {
			return mapper.map(advertencia.get(), AdvertenciasResponseDTO.class);
		}
		return null;

	}

	@Override
	public String create(AdvertenciasRequestDTO advertenciasDTO, long alunosId) {

		Optional<Alunos> aluno = alunosRepository.findById(alunosId);
		if (aluno.isPresent()) {
			Advertencias advertencia = new Advertencias();
			advertencia.setDescricao(advertenciasDTO.getDescricao());
			advertencia.setCreateAt(LocalDate.now());
			advertencia.setUpdateAt(LocalDate.now());
			advertencia.setAluno(aluno.get());
			advertencia.setStatus(advertenciasDTO.getStatus());
			advertencia = advertenciaRepository.save(advertencia);
			return String.valueOf(advertencia.getId());
		}
		return "Erro ao salvar";

	}

	@Override
	public AdvertenciasResponseDTO update(AdvertenciasRequestDTO advertenciasDTO, long alunosId) {

		Optional<Alunos> aluno = alunosRepository.findById(alunosId);
		if (aluno.isPresent()) {
			Optional<Advertencias> advertencia = advertenciaRepository.findById(advertenciasDTO.getId());
			if (advertencia.isPresent()) {
				advertencia.get().setDescricao(advertenciasDTO.getDescricao());
				advertencia.get().setUpdateAt(LocalDate.now());
				advertencia.get().setAluno(aluno.get());
				advertencia.get().setStatus(advertenciasDTO.getStatus());
				return mapper.map(advertenciaRepository.saveAndFlush(advertencia.get()), AdvertenciasResponseDTO.class);
			}
		}
		return null;

	}

	@Override
	public void delete(Long id) {
		advertenciaRepository.deleteById(id);
	}

}
