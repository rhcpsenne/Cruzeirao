package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Local;

public class LocalService {
private EntityManagerFactory emf;
	
	public LocalService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Local local) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(local);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Local> getLocais(){
		List<Local> locais;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select l From Local l");
		locais = q.getResultList();
		entm.close();
		
		return locais;
	}
}
