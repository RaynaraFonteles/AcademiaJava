package teste;

import infra.DAO;
import model.Ninja;

public class Teste {

	public Teste() {
	}

	public static void main(String[] args) {

		Ninja naruto = new Ninja("Naruto", 30, "Ninjutsu", "Konoha");
		Ninja shikamaru = new Ninja("Shikamaru", 28, "Ninjutsu", "Konoha");

		DAO<Ninja> daoNinja = new DAO<>(Ninja.class);
		daoNinja.atualizar(6, "Itachi", "Genjutsu", "Nenhuma", 32);

		System.out.println(daoNinja.encontrarPeloId(3));
		daoNinja.abrir().delete(3).fechar();

		daoNinja.abrir().create(naruto).create(shikamaru).fechar();

	}
}