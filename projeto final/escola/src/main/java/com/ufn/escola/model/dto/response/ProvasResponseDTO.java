package com.ufn.escola.model.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProvasResponseDTO {

	private long id;
	private MateriasResponseDTO materia;
	private long notas;
	protected LocalDate createAt;

}
