package vendas;

public abstract class Funcionario {
	
	private double nroVendas;
	private double valorDaComissao;
	private double multiplicador;
	private String nome;
	
	public Funcionario (double nroVendas, double valorDaComissao, String nome) {
		this.nroVendas = nroVendas;
		this.valorDaComissao = valorDaComissao;
		this.nome = nome;
		this.multiplicador = 1.0;
	}
	
	public double getNroVendas() {
		return this.nroVendas;
	}
	
	public double getMultiplicador() {
		return this.multiplicador;
	}
	
	public void setMultiplicador(double multiplicador) {
		this.multiplicador = multiplicador;
	}
	
	public double getValorDaComissao() {
		return this.valorDaComissao;
	}
	
	public double calcularComissao() {
		return this.getNroVendas() * this.getValorDaComissao() * this.getMultiplicador();
	}
	
}