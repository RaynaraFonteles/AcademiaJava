package com.ufn.escola.model.dto.response;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TurmasResponseDTO {

	protected long id;
	protected String descricao;
	private List<AlunosResponseDTO> alunos;
	private List<MateriasResponseDTO> materias;
	protected LocalDate createAt;

}
