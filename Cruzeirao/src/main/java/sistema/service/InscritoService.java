package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Inscrito;

public class InscritoService {
private EntityManagerFactory emf;
	
	public InscritoService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Inscrito inscrito) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(inscrito);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Inscrito> getInscritos(){
		List<Inscrito> inscritos;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select i From Inscrito i");
		inscritos = q.getResultList();
		entm.close();
		
		return inscritos;
	}
}
