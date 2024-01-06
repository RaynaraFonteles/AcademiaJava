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
 * import com.ufn.escola.model.Alunos; import com.ufn.escola.model.Escolas;
 * import com.ufn.escola.model.dto.request.AlunosRequestDTO; import
 * com.ufn.escola.model.dto.response.AlunosResponseDTO; import
 * com.ufn.escola.repository.AlunosRepository; import
 * com.ufn.escola.repository.EscolasRepository; import
 * com.ufn.escola.service.AlunosService;
 * 
 * @Service public class AlunosServiceImpl implements AlunosService {
 * 
 * @Autowired private AlunosRepository alunosRepository;
 * 
 * @Autowired private EscolasRepository escolasRepository;
 * 
 * @Autowired private ModelMapper mapper;
 * 
 * @Override public AlunosResponseDTO findById(Long escolaId, Long alunosId) {
 * Optional<Escolas> escola = escolasRepository.findById(escolaId); if
 * (escola.isPresent()) { return
 * mapper.map(escola.get().getAlunos().stream().filter(t -> t.getId() ==
 * alunosId) .collect(Collectors.toList()).get(0), AlunosResponseDTO.class); }
 * return null; }
 * 
 * @Override public List<AlunosResponseDTO> findAll(long escolaId) {
 * Optional<Escolas> escola = escolasRepository.findById(escolaId); if
 * (escola.isPresent()) { return escola.get().getAlunos().stream().map(t ->
 * mapper.map(t, AlunosResponseDTO.class)).toList(); } return null; }
 * 
 * @Override public String create(AlunosRequestDTO alunosDTO, Long escolaId) {
 * Optional<Escolas> escola = escolasRepository.findById(escolaId); if
 * (escola.isPresent()) { Alunos aluno = new Alunos();
 * aluno.setNome(alunosDTO.getNome()); aluno.setCreateAt(LocalDate.now());
 * aluno.setEndereco(alunosDTO.getEndereco());
 * aluno.setDocumento(alunosDTO.getDocumento());
 * escola.get().getAlunos().add(alunosRepository.save(aluno)); return
 * "Salvo com sucesso"; } return null; }
 * 
 * @Override public AlunosResponseDTO update(AlunosRequestDTO alunos, Long
 * escolaId) { Optional<Escolas> escola = escolasRepository.findById(escolaId);
 * if (escola.isPresent()) { Alunos aluno = new Alunos();
 * aluno.setId(alunosDTO.getId()); aluno.setUpdateAt(LocalDate.now());
 * aluno.setNome(alunosDTO.getNome());
 * aluno.setEndereco(alunosDTO.getEndereco());
 * aluno.setDocumento(alunosDTO.getDocumento()); aluno =
 * alunosRepository.save(aluno); return mapper.map(aluno,
 * AlunosResponseDTO.class); } return null; }
 * 
 * @Override public void delete(Long id) { alunosRepository.deleteById(id); }
 * 
 * }
 */