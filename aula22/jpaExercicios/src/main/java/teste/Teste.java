package teste;

import infra.DAO;
import model.Ninja;

public class Teste {

	public Teste() {
	}

	public static void main(String[] args) {

		// CRIAR TRANSAÇÃO NO BANCO DE DADOS
		//daoNinja.abrir().create(naruto).create(shikamaru).fechar();

		// CREATE
		// Ninja naruto = new Ninja("Naruto", 30, "Ninjutsu", "Konoha");
		// Ninja shikamaru = new Ninja("Shikamaru", 28, "Ninjutsu", "Konoha");
		// DAO<Ninja> daoNinja = new DAO<>(Ninja.class);

		// READ - GET
		// DAO<Ninja> daoNinja = new DAO<>(Ninja.class);
		// System.out.println(daoNinja.encontrarPeloId(6));

		// DELETE
		// DAO<Ninja> daoNinja = new DAO<>(Ninja.class);
		// daoNinja.abrir().delete(6).fechar();

		// UPDATE
		// DAO<Ninja> daoNinja = new DAO<>(Ninja.class);
		// daoNinja.atualizar(7, "Itachi", "Genjutsu", "Nenhuma", 32);

	}
}
