package com.ufn.escola.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "funcionarios")
public class Funcionarios {

	@Id
	@GeneratedValue(generator="funcionario_seq")
	@SequenceGenerator(name="funcionario_seq",sequenceName="FUNCIONARIO_SEQ", allocationSize=1)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "turma_id")
	protected Turmas turma;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "escola_id")
	protected Escolas escola;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "funcao")
	private String funcao;

	@Column
	protected LocalDate createAt;
	@Column
	protected LocalDate updateAt;
	@Column
	protected LocalDate deletedAt;

}
