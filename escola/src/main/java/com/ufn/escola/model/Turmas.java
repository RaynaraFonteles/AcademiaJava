package com.ufn.escola.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "turmas")
public class Turmas {

	@Id
	@GeneratedValue(generator="turma_seq")
	@SequenceGenerator(name="turma_seq",sequenceName="TURMA_SEQ", allocationSize=1)
	protected long id;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "turma")
	private List<Funcionarios> funcionarios;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "turma")
	private List<Alunos> alunos;
	
	@ManyToMany
	private List<Materias> materias;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "escola_id")
	protected Escolas escola;
	
	@Column
	protected LocalDate createAt;
	@Column
	protected LocalDate updateAt;
	@Column
	protected LocalDate deletedAt;
	
}
