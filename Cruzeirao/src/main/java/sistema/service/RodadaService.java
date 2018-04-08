package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Rodada;

public class RodadaService {
private EntityManagerFactory emf;
	
	public RodadaService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Rodada rodada) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(rodada);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Rodada> getRodadas(){
		List<Rodada> rodadas;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select r From Rodada r");
		rodadas = q.getResultList();
		entm.close();
		
		return rodadas;
	}
}
