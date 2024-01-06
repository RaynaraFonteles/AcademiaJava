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
 * import com.ufn.escola.model.dto.request.ProvasRequestDTO; import
 * com.ufn.escola.model.dto.response.ProvasResponseDTO; import
 * com.ufn.escola.service.ProvasService;
 * 
 * import jakarta.validation.constraints.NotNull;
 * 
 * @RestController
 * 
 * @RequestMapping("/escolas") public class ProvasController {
 * 
 * @Autowired private ProvasService ProvasService;
 * 
 * @GetMapping("/{escola_id}/provas") public List<ProvasResponseDTO>
 * findAll(@PathVariable(value = "escola_id") long escolaId) { return
 * ProvasService.findAll(escolaId); }
 * 
 * @GetMapping("/{escola_id}/provas/{provas_id}")
 * 
 * @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
 * public ProvasResponseDTO findById(@PathVariable(value = "escola_id") @NotNull
 * Long escolaId,
 * 
 * @PathVariable(value = "provas_id") Long provasId) { return
 * ProvasService.findById(escolaId, provasId); }
 * 
 * @PostMapping("/{escola_id}/provas") public String create(@RequestBody
 * ProvasRequestDTO ProvasDTO, @PathVariable(value = "escola_id") Long escolaId)
 * { return ProvasService.create(ProvasDTO, escolaId); }
 * 
 * @PutMapping("/{escola_id}/provas") public ProvasResponseDTO
 * update(@RequestBody ProvasRequestDTO Provas, @PathVariable(value =
 * "escola_id") Long escolaId) { return ProvasService.update(Provas, escolaId);
 * }
 * 
 * @DeleteMapping("/{escola_id}/provas/{provas_id}") public String
 * delete(@PathVariable(value = "escola_id") @NotNull Long escolaId,
 * 
 * @PathVariable(value = "provas_id") Long provasId) { try {
 * ProvasService.delete(provasId); return "Excluído com sucesso!"; } catch
 * (Exception e) { e.getMessage(); } return "Turma não excluída!"; }
 * 
 * 
 * }
 */