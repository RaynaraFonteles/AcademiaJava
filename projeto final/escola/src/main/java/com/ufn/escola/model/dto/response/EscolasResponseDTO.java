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
public class EscolasResponseDTO {

	protected long id;
	protected String nome;
	protected String endereco;
	protected List<FuncionariosResponseDTO> funcionarios;
	protected List<PatrimoniosResponseDTO> patrimonios;
	protected List<TurmasResponseDTO> turma;
	protected LocalDate createAt;

	
}
