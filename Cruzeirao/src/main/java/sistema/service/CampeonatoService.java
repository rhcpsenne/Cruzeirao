package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Campeonato;

public class CampeonatoService {
private EntityManagerFactory emf;
	
	public CampeonatoService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Campeonato campeonato) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(campeonato);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Campeonato> getCampeonatos(){
		List<Campeonato> campeonatos;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select c From Campeonato c");
		campeonatos = q.getResultList();
		entm.close();
		
		return campeonatos;
	}
}
