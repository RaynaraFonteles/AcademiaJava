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
public class MateriasRequestDTO {

	protected long id;
	protected String materia;
	protected long tempoSemestre;
	protected LocalDate createAt;

}
