
package com.ufn.escola.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufn.escola.model.Materias;
import com.ufn.escola.model.Turmas;
import com.ufn.escola.model.dto.request.MateriasRequestDTO;
import com.ufn.escola.model.dto.response.MateriasResponseDTO;
import com.ufn.escola.repository.MateriasRepository;
import com.ufn.escola.repository.TurmasRepository;
import com.ufn.escola.service.MateriasService;

@Service
public class MateriasServiceImpl implements MateriasService {

	@Autowired
	private MateriasRepository materiasRepository;

	@Autowired
	private TurmasRepository turmaRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public List<MateriasResponseDTO> findAll(long escolaId, long turmaId) {
		Optional<Turmas> turma = turmaRepository.findById(turmaId);
		if (turma.isEmpty()) {
			return new ArrayList<>();
		} else {
			return turma.get().getMaterias().stream().map(m -> mapper.map(m, MateriasResponseDTO.class)).toList();
		}
	}

	@Override
	public MateriasResponseDTO findById(long escolaId, long turmaId, Long materiaId) {
		Optional<Materias> materia = materiasRepository.findById(materiaId);
		if (materia.isEmpty()) {
			return null;
		} else {
			return mapper.map(materia.get(), MateriasResponseDTO.class);
		}
	}

	@Override
	public String create(MateriasRequestDTO materias, long escolaId, long turmaId) {
		Materias materia = new Materias();
		Optional<Turmas> turma = turmaRepository.findById(turmaId);
		if (!turma.isPresent()) {
			return "Erro ao criar!";
		}
		materia.setId(null);
		materia.setTurmas(new ArrayList<>());
		materia.setMateria(materias.getMateria());
		materia.setTempoSemestre(materias.getTempoSemestre());
		materia.getTurmas().add(turma.get());
		materia.setCreateAt(LocalDate.now());
		materia.setUpdateAt(LocalDate.now());
		materia = materiasRepository.saveAndFlush(materia);
		turma.get().getMaterias().add(materia);
		turmaRepository.saveAndFlush(turma.get());
		return String.valueOf(materia.getId());
	}

	@Override
	public MateriasResponseDTO update(MateriasRequestDTO materias, long escolaId, long turmaId) {
		Materias materia = new Materias();
		Optional<Turmas> turma = turmaRepository.findById(turmaId);
		if (!turma.isPresent()) {
			return null;
		}
		materia.setId(materias.getId());
		materia.setTurmas(new ArrayList<>());
		materia.setMateria(materias.getMateria());
		materia.setTempoSemestre(materias.getTempoSemestre());
		materia.getTurmas().add(turma.get());
		materia.setCreateAt(LocalDate.now());
		materia.setUpdateAt(LocalDate.now());

		return mapper.map(materiasRepository.saveAndFlush(materia), MateriasResponseDTO.class);
	}

	@Override
	public void delete(long escolaId, long turmaId, Long materiaId) {
		materiasRepository.deleteById(materiaId);

	}

}
