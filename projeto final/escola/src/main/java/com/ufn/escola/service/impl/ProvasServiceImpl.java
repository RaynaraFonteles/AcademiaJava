
package com.ufn.escola.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufn.escola.model.Alunos;
import com.ufn.escola.model.Materias;
import com.ufn.escola.model.Provas;
import com.ufn.escola.model.Turmas;
import com.ufn.escola.model.dto.request.ProvasRequestDTO;
import com.ufn.escola.model.dto.response.ProvasResponseDTO;
import com.ufn.escola.repository.AlunosRepository;
import com.ufn.escola.repository.MateriasRepository;
import com.ufn.escola.repository.ProvasRepository;
import com.ufn.escola.repository.TurmasRepository;
import com.ufn.escola.service.ProvasService;

@Service
public class ProvasServiceImpl implements ProvasService {

	@Autowired
	private ProvasRepository provasRepository;
	
	@Autowired
	private AlunosRepository alunosRepository;
	
	@Autowired
	private MateriasRepository materiasRepository;
	
	@Autowired
	private TurmasRepository turmaRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public List<ProvasResponseDTO> findAll(Long materiaId) {

		Optional<Materias> materia = materiasRepository.findById(materiaId);
		if (materia.isPresent()) {
			return materia.get().getProvas().stream().map(t -> mapper.map(t, ProvasResponseDTO.class)).toList();
		}
		return null;
	}

	@Override
	public ProvasResponseDTO findById(Long materiaId, Long provaId) {
		Optional<Materias> materia = materiasRepository.findById(materiaId);
		if (materia.isPresent()) {
			return mapper.map(materia.get().getProvas().stream().filter(t -> t.getId() == provaId)
					.collect(Collectors.toList()).get(0), ProvasResponseDTO.class);
		}
		return null;
	}

	@Override
	public String create(ProvasRequestDTO provasDTO, long materiaId, long turmaId) {
		Optional<Turmas> turma = turmaRepository.findById(turmaId);
		Optional<Materias> materia = materiasRepository.findById(materiaId);
		if (turma.isPresent() && materia.isPresent()) {
			Provas prova = new Provas();
			prova.setNotas(provasDTO.getNotas());
			prova.setDescricao(provasDTO.getDescricao());
			prova.setCreateAt(LocalDate.now());
			prova.setUpdateAt(LocalDate.now());
			prova.setMateria(materia.get());
			prova = provasRepository.save(prova);
			List<Alunos> alunos = turma.get().getAlunos();
			for(Alunos aluno: alunos) {
				aluno.getProvas().add(prova);
				alunosRepository.save(aluno);
			}
			return String.valueOf(prova.getId());
		}
		return null;
	}

	@Override
	public ProvasResponseDTO update(ProvasRequestDTO provasDTO, long materiaId, long turmaId) {
		Optional<Turmas> turma = turmaRepository.findById(turmaId);
		Optional<Materias> materia = materiasRepository.findById(materiaId);
		if (turma.isPresent() && materia.isPresent()) {
			Provas prova = new Provas();
			prova.setId(provasDTO.getId());
			prova.setNotas(provasDTO.getNotas());
			prova.setDescricao(provasDTO.getDescricao());
			prova.setCreateAt(LocalDate.now());
			prova.setUpdateAt(LocalDate.now());
			prova.setMateria(materia.get());
			
			return mapper.map(provasRepository.saveAndFlush(prova), ProvasResponseDTO.class);
		}
		return null;
	}

	@Override
	public void delete(Long provaId) {
		provasRepository.deleteById(provaId);
	}

}
