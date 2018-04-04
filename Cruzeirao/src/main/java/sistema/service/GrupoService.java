package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Grupo;

public class GrupoService {
private EntityManagerFactory emf;
	
	public GrupoService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Grupo grupo) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(grupo);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Grupo> getGrupos(){
		List<Grupo> grupos;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select g From Grupo g");
		grupos = q.getResultList();
		entm.close();
		
		return grupos;
	}
}
