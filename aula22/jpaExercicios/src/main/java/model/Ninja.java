package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ninjas")
public class Ninja<E> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String habilidade;
	private String aldeia;
	private Integer idade;

	public Ninja() {
	}

	public Ninja(String nome, Integer idade, String habilidade, String aldeia) {
		super();
		this.habilidade = habilidade;
		this.aldeia = aldeia;
		this.idade = idade;
		this.nome = nome;
	}

	private String nome;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}

	public String getAldeia() {
		return aldeia;
	}

	public void setAldeia(String aldeia) {
		this.aldeia = aldeia;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Ninja [nome =" + nome + ", idade =" + idade + ", habilidade =" + habilidade + ", aldeia =" + aldeia
				+ "]";
	}

}
