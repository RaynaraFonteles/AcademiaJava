package com.ufn.escola.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProvasRequestDTO {

	private long id;
	private long notas;
	private String descricao;

}
