package com.ufn.escola.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table
public class Escolas {

	@Id
	@GeneratedValue(generator="escola_seq")
	@SequenceGenerator(name="escola_seq",sequenceName="ESCOLA_SEQ", allocationSize=1)
	protected long id;
	@Column
	protected String nome;
	@Column
	protected String endereco;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "escola")
	protected List<Funcionarios> funcionarios;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "escola")
	protected List<Patrimonios> patrimonios;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "escola")
	protected List<Turmas> turma;
	@Column
	protected LocalDate createAt;
	@Column
	protected LocalDate updateAt;
	@Column
	protected LocalDate deletedAt;
}
