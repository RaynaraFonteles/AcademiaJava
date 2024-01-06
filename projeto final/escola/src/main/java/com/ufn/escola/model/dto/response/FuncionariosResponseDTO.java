package com.ufn.escola.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FuncionariosResponseDTO {

	private long id;
	private String nome;
	private String funcao;

}
