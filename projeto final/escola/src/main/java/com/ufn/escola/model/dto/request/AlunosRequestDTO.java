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
public class AlunosRequestDTO {
	
	protected long id;
	protected String nome;
	protected String endereco;
	protected String documento;
	protected LocalDate createAt;

}
