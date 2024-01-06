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
public class TurmasRequestDTO {
	
	protected long id;
	protected String descricao;
	protected LocalDate createAt;

}
