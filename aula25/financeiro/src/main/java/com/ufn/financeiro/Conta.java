package com.ufn.financeiro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "conta")
public class Conta {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "valor")
	private Double valor;

	@Column(name = "titular")
	private String titular;

	@Column(name = "tipo")
	private String tipo;

	public String Corrente() {
		return null;
	}

	public String Poupanca() {
		return null;
	}
}
