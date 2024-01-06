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
 * import com.ufn.escola.model.dto.request.MateriasRequestDTO; import
 * com.ufn.escola.model.dto.response.MateriasResponseDTO; import
 * com.ufn.escola.service.MateriasService;
 * 
 * import jakarta.validation.constraints.NotNull;
 * 
 * @RestController
 * 
 * @RequestMapping("/escolas") public class MateriasController {
 * 
 * @Autowired private MateriasService MateriasService;
 * 
 * @GetMapping("/{escola_id}/materias") public List<MateriasResponseDTO>
 * findAll(@PathVariable(value = "escola_id") long escolaId) { return
 * MateriasService.findAll(escolaId); }
 * 
 * @GetMapping("/{escola_id}/materias/{materias_id}")
 * 
 * @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
 * public MateriasResponseDTO findById(@PathVariable(value =
 * "escola_id") @NotNull Long escolaId,
 * 
 * @PathVariable(value = "materias_id") Long materiasId) { return
 * MateriasService.findById(escolaId, materiasId); }
 * 
 * @PostMapping("/{escola_id}/materias") public String create(@RequestBody
 * MateriasRequestDTO MateriasDTO,
 * 
 * @PathVariable(value = "escola_id") Long escolaId) { return
 * MateriasService.create(MateriasDTO, escolaId); }
 * 
 * @PutMapping("/{escola_id}/materias") public MateriasResponseDTO
 * update(@RequestBody MateriasRequestDTO Materias,
 * 
 * @PathVariable(value = "escola_id") Long escolaId) { return
 * MateriasService.update(Materias, escolaId); }
 * 
 * @DeleteMapping("/{escola_id}/materias/{materias_id}") public String
 * delete(@PathVariable(value = "escola_id") @NotNull Long escolaId,
 * 
 * @PathVariable(value = "materias_id") Long materiasId) { try {
 * MateriasService.delete(materiasId); return "Excluído com sucesso!"; } catch
 * (Exception e) { e.getMessage(); } return "Turma não excluída!"; }
 * 
 * }
 */