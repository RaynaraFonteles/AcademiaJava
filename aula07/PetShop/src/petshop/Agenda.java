package petshop;

import java.util.List;

public class Agenda {

	private Servicos servicos;
	private String data;
	private String horario;

	
	//  percorre a lista verificando se tem algum horário disponível 
	public void agendar(List<Agenda> agendas, Agenda agenda) {
		boolean agendaDisponível = false;
		for (Agenda a : agendas) {
			if (!a.getHorario().equals(agenda.getHorario()) || !a.getData().equals(agenda.getData())
					|| !a.getServico().descricao().equals(agenda.getServico().descricao())) {
				agendaDisponível = true;
			}else {
				agendaDisponível = false;
				break;
			}
		}
		
		
		// se a agenda tiver disponível adiciona na lista e printa a mensagem na tela
		if(agendaDisponível) {
			agendas.add(agenda);
			System.out.println("Agenda confirmada com sucesso!");
		}else {
			System.out.println("Conflito de agendas!");
		}
	}
	
	public Agenda() {
	}

	public Agenda(Animal animal, Servicos servico, String data, String horario) {
		this.animal = animal;
		this.servicos = servico;
		this.data = data;
		this.horario = horario;
	}

	private Animal animal;

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Servicos getServico() {
		return servicos;
	}

	public void setServico(Servicos servico) {
		this.servicos = servico;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Agenda [servicos=" + servicos.descricao() + ", data=" + data + ", horario=" + horario + ", animal="
				+ animal + "]";
	}

}