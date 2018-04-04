package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Partida;

public class PartidaService {
private EntityManagerFactory emf;
	
	public PartidaService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Partida partida) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(partida);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Partida> getPartidas(){
		List<Partida> partidas;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select p From Partida p");
		partidas = q.getResultList();
		entm.close();
		
		return partidas;
	}
}
