/*
 * package com.ufn.escola.service.impl;
 * 
 * import java.util.List;
 * 
 * import org.modelmapper.ModelMapper; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.ufn.escola.model.dto.request.AdvertenciasRequestDTO; import
 * com.ufn.escola.model.dto.response.AdvertenciasResponseDTO; import
 * com.ufn.escola.repository.AdvertenciasRepository; import
 * com.ufn.escola.repository.EscolasRepository; import
 * com.ufn.escola.service.AdvertenciasService;
 * 
 * @Service public class AdvertenciasServiceImpl implements AdvertenciasService
 * {
 * 
 * @Autowired private AdvertenciasRepository advertenciasRepository;
 * 
 * @Autowired private EscolasRepository escolaRepository;
 * 
 * @Autowired private ModelMapper mapper;
 * 
 * //@Override //public List<AdvertenciasResponseDTO> findAll(Long alunosId) {
 * 
 * 
 * Optional<Escolas> escola = escolaRepository.findById(escolaId); if
 * (escola.isPresent()) { return escola.get().getAdvertencias().stream().map(t
 * -> mapper.map(t, AdvertenciasResponseDTO.class)) .toList(); } return null;
 * 
 * }
 * 
 * @Override public AdvertenciasResponseDTO findById(Long alunosId, Long
 * advertenciasId) {
 * 
 * Optional<Escolas> escola = escolaRepository.findById(escolaId); if
 * (escola.isPresent()) { return
 * mapper.map(escola.get().getAdvertencias().stream().filter(t -> t.getId() ==
 * advertenciasId) .collect(Collectors.toList()).get(0),
 * AdvertenciasResponseDTO.class); } return null;
 * 
 * }
 * 
 * @Override public String create(AdvertenciasRequestDTO advertencias, long
 * alunosId) {
 * 
 * Optional<Escolas> escola = escolaRepository.findById(escolaId); if
 * (escola.isPresent()) { Advertencias advertencia = new Advertencias();
 * advertencia.setDescricao(advertenciasDTO.getDescricao());
 * advertencia.setCreateAt(LocalDate.now());
 * advertencia.setAluno(advertenciasDTO.getAluno());
 * advertencia.setStatus(advertenciasDTO.getStatus());
 * escola.get().getAdvertencias().add(AdvertenciasRepository.save(advertencia));
 * return "Salvo com sucesso"; } return null;
 * 
 * }
 * 
 * @Override public AdvertenciasResponseDTO update(AdvertenciasRequestDTO
 * advertencias, long alunosId) {
 * 
 * Optional<Escolas> escola = escolaRepository.findById(escolaId); if
 * (escola.isPresent()) { Advertencias advertencia = new Advertencias();
 * advertencia.setId(advertenciasDTO.getId());
 * advertencia.setDescricao(advertenciasDTO.getDescricao());
 * advertencia.setUpdateAt(LocalDate.now());
 * advertencia.setAluno(advertenciasDTO.getAluno());
 * advertencia.setStatus(advertenciasDTO.getStatus()); advertencia =
 * advertenciasRepository.save(advertencia); return mapper.map(advertencia,
 * AdvertenciasResponseDTO.class); } return null;
 * 
 * }
 * 
 * @Override public void delete(Long id) {
 * advertenciasRepository.deleteById(id); }
 * 
 * }
 */