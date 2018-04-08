package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Inscricao;

public class InscricaoService {
private EntityManagerFactory emf;
	
	public InscricaoService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Inscricao inscricao) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(inscricao);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Inscricao> getInscricao(){
		List<Inscricao> inscricoes;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select i From Inscricao i");
		inscricoes = q.getResultList();
		entm.close();
		
		return inscricoes;
	}
}
