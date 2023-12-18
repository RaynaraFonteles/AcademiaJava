package com.ufn.escola.model;


import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "alunos")
public class Alunos {

	@Id
	@GeneratedValue(generator="aluno_seq")
	@SequenceGenerator(name="aluno_seq",sequenceName="ALUNO_SEQ", allocationSize=1)
	protected long id;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "turma_id")
	protected Turmas turma;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "escola_id")
	protected Escolas escola;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aluno")
	protected List<Provas> provas;
	
	@Column(name = "nome")
	protected String nome;
	@Column
	protected String endereco;
	@Column
	protected String documento;
	@Column
	protected LocalDate createAt;
	@Column
	protected LocalDate updateAt;
	@Column
	protected LocalDate deletedAt;
	

}
