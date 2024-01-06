/*
 * package com.ufn.escola.service.impl;
 * 
 * import java.time.LocalDate; import java.util.List; import java.util.Optional;
 * import java.util.stream.Collectors;
 * 
 * import org.modelmapper.ModelMapper; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.ufn.escola.model.Escolas; import com.ufn.escola.model.Materias;
 * import com.ufn.escola.model.dto.request.MateriasRequestDTO; import
 * com.ufn.escola.model.dto.response.MateriasResponseDTO; import
 * com.ufn.escola.repository.EscolasRepository; import
 * com.ufn.escola.repository.MateriasRepository; import
 * com.ufn.escola.service.MateriasService;
 * 
 * @Service public class MateriasServiceImpl implements MateriasService {
 * 
 * @Autowired private MateriasRepository materiasRepository;
 * 
 * @Autowired private EscolasRepository escolaRepository;
 * 
 * @Autowired private ModelMapper mapper;
 * 
 * @Override public List<MateriasResponseDTO> findAll(Long escolaId) {
 * 
 * Optional<Escolas> escola = escolaRepository.findById(escolaId); if
 * (escola.isPresent()) { return escola.get().getMaterias().stream().map(t ->
 * mapper.map(t, MateriasResponseDTO.class)).toList(); } return null; }
 * 
 * @Override public MateriasResponseDTO findById(Long escolaId, Long materiasId)
 * { Optional<Escolas> escola = escolaRepository.findById(escolaId); if
 * (escola.isPresent()) { return
 * mapper.map(escola.get().getMaterias().stream().filter(t -> t.getId() ==
 * materiasId) .collect(Collectors.toList()).get(0), MateriasResponseDTO.class);
 * } return null; }
 * 
 * @Override public String create(MateriasRequestDTO materiasDTO, long escolaId)
 * { Optional<Escolas> escola = escolaRepository.findById(escolaId); if
 * (escola.isPresent()) { Materias materia = new Materias();
 * materia.setMaterias(materiasDTO.getMaterias());
 * materia.setCreateAt(LocalDate.now());
 * materia.setTempoSemestre(materiasDTO.getTempoSemestre());
 * escola.get().getMaterias().add(materiasRepository.save(materia)); return
 * "Salvo com sucesso"; } return null; }
 * 
 * @Override public MateriasResponseDTO update(MateriasRequestDTO materiasDTO,
 * long escolaId) { Optional<Escolas> escola =
 * escolaRepository.findById(escolaId); if (escola.isPresent()) { Materias
 * materia = new Materias(); materia.setId(materiasDTO.getId());
 * materia.setMaterias(materiasDTO.getMaterias());
 * materia.setUpdateAt(LocalDate.now());
 * materia.setTempoSemestre(materiasDTO.getTempoSemestre()); materia =
 * materiasRepository.save(materia); return mapper.map(materia,
 * MateriasResponseDTO.class); } return null; }
 * 
 * @Override public void delete(Long id) { materiasRepository.deleteById(id); }
 * 
 * }
 */