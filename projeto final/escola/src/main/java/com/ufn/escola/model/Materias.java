package com.ufn.escola.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
@Table(name = "materias")
public class Materias {

	@Id
	@GeneratedValue(generator="materia_seq")
	@SequenceGenerator(name="materia_seq",sequenceName="MATERIA_SEQ", allocationSize=1)
	protected Long id;
	
	@Column(name = "materia")
	protected String materia;
	@Column
	protected long tempoSemestre;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materia")
	protected List<Provas> provas;
	@ManyToMany(mappedBy = "materias", cascade = CascadeType.ALL)
	protected List<Turmas> turmas;
	@Column
	protected LocalDate createAt;
	@Column
	protected LocalDate updateAt;
	@Column
	protected LocalDate deletedAt;

}
