package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.PartidaFutebol;

public class PartidaFutebolService {
private EntityManagerFactory emf;
	
	public PartidaFutebolService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(PartidaFutebol partfut) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(partfut);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<PartidaFutebol> getPFs(){
		List<PartidaFutebol> pfs;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select pf From PartidaFutebol pf");
		pfs = q.getResultList();
		entm.close();
		
		return pfs;
	}
}
