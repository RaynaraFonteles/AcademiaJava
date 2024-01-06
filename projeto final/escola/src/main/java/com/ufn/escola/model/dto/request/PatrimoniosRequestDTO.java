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
public class PatrimoniosRequestDTO {

	protected long id;
	
	protected String nome;
	protected String descricao;
	protected String status;
	protected LocalDate createAt;

}
