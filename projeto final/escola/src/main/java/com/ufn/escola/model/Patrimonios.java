package com.ufn.escola.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "patrimonios")
public class Patrimonios {

	@Id
	@GeneratedValue(generator="patrimonio_seq")
	@SequenceGenerator(name="patrimonio_seq",sequenceName="PATRIMONIO_SEQ", allocationSize=1)
	protected long id;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "escola_id")
	protected Escolas escola;
	@Column
	protected String nome;
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
