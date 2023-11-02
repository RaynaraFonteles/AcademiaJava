package vendas;

public class Gerente extends Funcionario {

	public Gerente (double nroVendas, double valorDaComissao, String nome) {
		
		super(nroVendas, valorDaComissao, nome);
		setMultiplicador(1.5);
		//this.multiplicador = 1.5;
		
	}
	
	public double getMultiplicador(boolean VendedorOlhando) {
		if (VendedorOlhando) {
			return 1.0;
		} else {
			return getMultiplicador();
		}
	}
}
