package com.ufn.escola.model.dto.request;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FuncionariosRequestDTO {

	private long id;
	private String nome;
	private String funcao;
	protected LocalDate createAt;

}
