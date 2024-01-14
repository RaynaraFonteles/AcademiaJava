package com.ufn.escola.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "provas")
public class Provas {

	@Id
	@GeneratedValue(generator="prova_seq")
	@SequenceGenerator(name="prova_seq",sequenceName="PROVA_SEQ", allocationSize=1)
	private long id;
	
	@ManyToMany(mappedBy = "provas", cascade = CascadeType.ALL)
	private List<Alunos> aluno;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materia_id")
	private Materias materia;
	
	@Column
	private String descricao;
	
	@Column
	private long notas;

	@Column
	protected LocalDate createAt;
	
	@Column
	protected LocalDate updateAt;
	
	@Column
	protected LocalDate deletedAt;

}
