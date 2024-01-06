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
 * import com.ufn.escola.model.Escolas; import com.ufn.escola.model.Provas;
 * import com.ufn.escola.model.dto.request.ProvasRequestDTO; import
 * com.ufn.escola.model.dto.response.ProvasResponseDTO; import
 * com.ufn.escola.repository.EscolasRepository; import
 * com.ufn.escola.repository.ProvasRepository; import
 * com.ufn.escola.service.ProvasService;
 * 
 * @Service public class ProvasServiceImpl implements ProvasService {
 * 
 * @Autowired private ProvasRepository provasRepository;
 * 
 * @Autowired private EscolasRepository escolaRepository;
 * 
 * @Autowired private ModelMapper mapper;
 * 
 * @Override public List<ProvasResponseDTO> findAll(Long escolaId) {
 * 
 * Optional<Escolas> escola = escolaRepository.findById(escolaId); if
 * (escola.isPresent()) { return escola.get().getProvas().stream().map(t ->
 * mapper.map(t, ProvasResponseDTO.class)).toList(); } return null; }
 * 
 * @Override public ProvasResponseDTO findById(Long escolaId, Long provasId) {
 * Optional<Escolas> escola = escolaRepository.findById(escolaId); if
 * (escola.isPresent()) { return
 * mapper.map(escola.get().getProvas().stream().filter(t -> t.getId() ==
 * provasId) .collect(Collectors.toList()).get(0), ProvasResponseDTO.class); }
 * return null; }
 * 
 * @Override public String create(ProvasRequestDTO provasDTO, long escolaId) {
 * Optional<Escolas> escola = escolaRepository.findById(escolaId); if
 * (escola.isPresent()) { Provas prova = new Provas();
 * prova.setNotas(provasDTO.getNotas()); prova.setCreateAt(LocalDate.now());
 * escola.get().getProvas().add(provasRepository.save(prova)); return
 * "Salvo com sucesso"; } return null; }
 * 
 * @Override public ProvasResponseDTO update(ProvasRequestDTO provasDTO, long
 * escolaId) { Optional<Escolas> escola = escolaRepository.findById(escolaId);
 * if (escola.isPresent()) { Provas prova = new Provas();
 * prova.setId(provasDTO.getId()); prova.setNotas(provasDTO.getNotas());
 * prova.setUpdateAt(LocalDate.now()); prova = provasRepository.save(prova);
 * return mapper.map(prova, ProvasResponseDTO.class); } return null; }
 * 
 * @Override public void delete(Long id) { provasRepository.deleteById(id); }
 * 
 * }
 */