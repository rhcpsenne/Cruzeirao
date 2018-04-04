package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Gol;

public class GolService {
private EntityManagerFactory emf;
	
	public GolService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Gol gol) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(gol);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Gol> getGols(){
		List<Gol> gols;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select g From Gol g");
		gols = q.getResultList();
		entm.close();
		
		return gols;
	}
}
