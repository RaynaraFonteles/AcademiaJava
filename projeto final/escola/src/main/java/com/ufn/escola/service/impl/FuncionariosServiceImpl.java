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
 * import com.ufn.escola.model.Escolas; import
 * com.ufn.escola.model.Funcionarios; import
 * com.ufn.escola.model.dto.request.FuncionariosRequestDTO; import
 * com.ufn.escola.model.dto.response.FuncionariosResponseDTO; import
 * com.ufn.escola.repository.EscolasRepository; import
 * com.ufn.escola.repository.FuncionariosRepository; import
 * com.ufn.escola.service.FuncionariosService;
 * 
 * @Service public class FuncionariosServiceImpl implements FuncionariosService
 * {
 * 
 * @Autowired private FuncionariosRepository funcionariosRepository;
 * 
 * @Autowired private EscolasRepository escolaRepository;
 * 
 * @Autowired private ModelMapper mapper;
 * 
 * @Override public List<FuncionariosResponseDTO> findAll(Long escolaId) {
 * 
 * Optional<Escolas> escola = escolaRepository.findById(escolaId); if
 * (escola.isPresent()) { return escola.get().getFuncionarios().stream().map(t
 * -> mapper.map(t, FuncionariosResponseDTO.class)) .toList(); } return null; }
 * 
 * @Override public FuncionariosResponseDTO findById(Long escolaId, Long
 * funcionariosId) { Optional<Escolas> escola =
 * escolaRepository.findById(escolaId); if (escola.isPresent()) { return
 * mapper.map(escola.get().getFuncionarios().stream().filter(t -> t.getId() ==
 * funcionariosId) .collect(Collectors.toList()).get(0),
 * FuncionariosResponseDTO.class); } return null; }
 * 
 * @Override public String create(FuncionariosRequestDTO funcionariosDTO, long
 * escolaId) { Optional<Escolas> escola = escolaRepository.findById(escolaId);
 * if (escola.isPresent()) { Funcionarios funcionario = new Funcionarios();
 * funcionario.setDescricao(funcionariosDTO.getDescricao());
 * funcionario.setCreateAt(LocalDate.now());
 * funcionario.setFuncao(funcionariosDTO.getFuncao());
 * escola.get().getFuncionarios().add(funcionariosRepository.save(funcionario));
 * return "Salvo com sucesso"; } return null; }
 * 
 * @Override public FuncionariosResponseDTO update(FuncionariosRequestDTO
 * funcionariosDTO, long escolaId) { Optional<Escolas> escola =
 * escolaRepository.findById(escolaId); if (escola.isPresent()) { Funcionarios
 * funcionario = new Funcionarios(); funcionario.setId(funcionariosDTO.getId());
 * funcionario.setDescricao(funcionariosDTO.getDescricao());
 * funcionario.setUpdateAt(LocalDate.now());
 * funcionario.setEscola(funcionariosDTO.getEscola()); funcionario =
 * funcionariosRepository.save(funcionario); return mapper.map(funcionario,
 * FuncionariosResponseDTO.class); } return null; }
 * 
 * @Override public void delete(Long id) {
 * funcionariosRepository.deleteById(id); }
 * 
 * }
 */