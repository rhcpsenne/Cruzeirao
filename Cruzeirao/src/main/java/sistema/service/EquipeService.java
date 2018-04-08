package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Equipe;

public class EquipeService {
private EntityManagerFactory emf;
	
	public EquipeService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Equipe equipe) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(equipe);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Equipe> getEquipes(){
		List<Equipe> equipes;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select e From Equipe e");
		equipes = q.getResultList();
		entm.close();
		
		return equipes;
	}
}
