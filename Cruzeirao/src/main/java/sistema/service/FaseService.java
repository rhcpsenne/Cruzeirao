package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Fase;

public class FaseService {
private EntityManagerFactory emf;
	
	public FaseService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Fase fase) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(fase);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Fase> getFases(){
		List<Fase> fases;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select f From Fase f");
		fases = q.getResultList();
		entm.close();
		
		return fases;
	}
}
