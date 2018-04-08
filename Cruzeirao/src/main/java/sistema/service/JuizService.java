package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Juiz;

public class JuizService {
private EntityManagerFactory emf;
	
	public JuizService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Juiz juiz) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(juiz);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Juiz> getJuizes(){
		List<Juiz> juizes;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select j From Juiz j");
		juizes = q.getResultList();
		entm.close();
		
		return juizes;
	}
}
