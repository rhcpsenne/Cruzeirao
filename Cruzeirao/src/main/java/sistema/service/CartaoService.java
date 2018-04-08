package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Cartao;


public class CartaoService {
private EntityManagerFactory emf;
	
	public CartaoService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Cartao cartao) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(cartao);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Cartao> getCartoes(){
		List<Cartao> cartoes;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select c From Cartao c");
		cartoes = q.getResultList();
		entm.close();
		
		return cartoes;
	}
}
