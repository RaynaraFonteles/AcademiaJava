/*
 * package com.ufn.escola.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.access.prepost.PreAuthorize; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.ufn.escola.model.dto.request.AdvertenciasRequestDTO; import
 * com.ufn.escola.model.dto.response.AdvertenciasResponseDTO; import
 * com.ufn.escola.service.AdvertenciasService;
 * 
 * import jakarta.validation.constraints.NotNull;
 * 
 * @RestController
 * 
 * @RequestMapping("/escolas") public class AdvertenciasController {
 * 
 * @Autowired private AdvertenciasService AdvertenciasService;
 * 
 * @GetMapping("/{escola_id}/advertencias") public List<AdvertenciasResponseDTO>
 * findAll(@PathVariable(value = "escola_id") long escolaId) { return
 * AdvertenciasService.findAll(escolaId); }
 * 
 * @GetMapping("/{escola_id}/advertencias/{advertencias_id}")
 * 
 * @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
 * public AdvertenciasResponseDTO findById(@PathVariable(value =
 * "escola_id") @NotNull Long escolaId,
 * 
 * @PathVariable(value = "advertencias_id") Long advertenciasId) { return
 * AdvertenciasService.findById(escolaId, advertenciasId); }
 * 
 * @PostMapping("/{escola_id}/advertencias") public String create(@RequestBody
 * AdvertenciasRequestDTO AdvertenciasDTO,
 * 
 * @PathVariable(value = "escola_id") Long escolaId) { return
 * AdvertenciasService.create(AdvertenciasDTO, escolaId); }
 * 
 * @PutMapping("/{escola_id}/advertencias") public AdvertenciasResponseDTO
 * update(@RequestBody AdvertenciasRequestDTO Advertencias,
 * 
 * @PathVariable(value = "escola_id") Long escolaId) { return
 * AdvertenciasService.update(Advertencias, escolaId); }
 * 
 * @DeleteMapping("/{escola_id}/advertencias/{advertencias_id}") public String
 * delete(@PathVariable(value = "escola_id") @NotNull Long escolaId,
 * 
 * @PathVariable(value = "advertencias_id") Long advertenciasId) { try {
 * AdvertenciasService.delete(advertenciasId); return "Excluído com sucesso!"; }
 * catch (Exception e) { e.getMessage(); } return "Turma não excluída!"; }
 * 
 * }
 */