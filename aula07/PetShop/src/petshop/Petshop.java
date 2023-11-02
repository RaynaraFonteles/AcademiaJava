package petshop;
import java.util.ArrayList;
import java.util.List;

public class Petshop {

	public static void main(String[] args) {

		// criando um Arraylist de Produtos 
		List<Produtos> produtos = new ArrayList<Produtos>();
		
		// adicionando produtos na lista de Produtos
		produtos.add(new Produtos("Shampoo", "Higiene", 10.0, 10));
		produtos.add(new Produtos("Coleira", "Acessórios", 20.0, 10));

		
		// chamando o método vender com os parâmetros
		new Produtos().vender(produtos, "Shampoo", 9);

		{
			System.out.println("============================");
			System.out.println("Restaram | Nome   | Quantidade");
			System.out.println("");
			for (Produtos p : produtos) {
				System.out.println("Item     | " + p.getNome() + " | " + p.getQuantidadeEstoque());
			}
		}
		
		
		// criando um Arraylist de agenda 
		List<Agenda> agendas = new ArrayList<Agenda>();
		
		// adicionando os serviços e animais na lista - polimorfismo
		agendas.add(new Agenda(new Cachorro("Scooby", "Dog", "Pitbull", "10/10/23", "Joaquim"), new Tosa(), "17/10/23", "09:00"));
		agendas.add(new Agenda(new Cachorro("Bidu", "Dog", "Pintcher", "09/10/23", "Maria"), new Banho(), "17/10/23", "10:00"));
		agendas.add(new Agenda(new Cachorro("Bidu", "Dog", "Pintcher", "09/10/23", "Maria"), new ConsultaVeterinaria(), "17/10/23", "11:00"));

		
		// chamando o método agendar com os parâmetros
		new Agenda().agendar(agendas, new Agenda(new Cachorro("Scooby", "Dog", "Pitbull", "10/10/23", "Joaquim"),
				new Banho(), "17/10/23", "09:00"));
		new Agenda().agendar(agendas, new Agenda(new Cachorro("Scooby", "Dog", "Pitbull", "10/10/23", "Joaquim"),
				new Tosa(), "18/10/23", "09:00"));
		System.out.println("");
		System.out.println("");
		
		// confirmando agenda 
		for (Agenda a : agendas) {
			System.out.println("Agendas Confirmadas: " + a.getAnimal().getNome() + " | " + a.getServico().descricao()
					+ " | " + a.getHorario() + " - " + a.getData());
		}
	}

}