package petshop;

public class ConsultaVeterinaria extends Servicos {

	@Override
	public String descricao() {
		return "Serviço: Consulta no Veterinário";
	}

	@Override
	public double preco() {
		return 100.0;

	}
}
