package com.ufn.escola.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "advertencias")
public class Advertencias {

	@Id
	@GeneratedValue(generator = "advertencia_seq")
	@SequenceGenerator(name = "advertencia_seq", sequenceName = "ADVERTENCIA_SEQ", allocationSize = 1)
	protected long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "aluno_id")
	protected Alunos aluno;

	@Column
	protected String descricao;
	@Column
	protected String status;
	@Column
	protected LocalDate createAt;
	@Column
	protected LocalDate updateAt;
	@Column
	protected LocalDate deletedAt;

}
