package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Categoria;


public class CategoriaService {
private EntityManagerFactory emf;
	
	public CategoriaService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Categoria categoria) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(categoria);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Categoria> getCategorias(){
		List<Categoria> categorias;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select c From Categoria c");
		categorias = q.getResultList();
		entm.close();
		
		return categorias;
	}
}
