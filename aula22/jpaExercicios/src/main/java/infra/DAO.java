package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Ninja;

public class DAO<E> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> entidade;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("JPAExercicios");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public DAO(Class<E> entidade) {
		this.entidade = entidade;
		em = emf.createEntityManager();
	}

	public DAO<E> abrir() {
		em.getTransaction().begin();
		return this;
	}

	public DAO<E> fechar() {
		em.getTransaction().commit();
		return this;
	}

	public DAO<E> create(E entidade) {
		em.persist(entidade);
		return this;
	}

	public E encontrarPeloId(Object id) {
		return em.find(entidade, id);
	}

	public DAO<E> delete(int id) {
		DAO<E> dao = new DAO<E>(entidade);
		E ninjaEncontrado = dao.encontrarPeloId(id);
		em.remove(em.contains(ninjaEncontrado) ? ninjaEncontrado : em.merge(ninjaEncontrado));
		return this;
	}

	public Ninja atualizar(int id, String nome, String habilidade, String aldeia, int idade) {
		DAO<E> dao = new DAO<E>(entidade);
		dao.abrir();

		Ninja ninja = (Ninja) dao.encontrarPeloId(id);
		ninja.setNome(nome);
		ninja.setHabilidade(habilidade);
		ninja.setAldeia(aldeia);
		ninja.setIdade(idade);

		em.merge(ninja);

		dao.fechar();

		return ninja;
	}

}
