package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sistema.modelos.Usuario;

public class UsuarioService {
	private EntityManagerFactory emf;
	
	public UsuarioService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Usuario usuario) {
		EntityManager entm = emf.createEntityManager();
		entm.getTransaction().begin();
			entm.persist(usuario);
		entm.getTransaction().commit();
		entm.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios(){
		List<Usuario> usuarios;
		
		EntityManager entm = emf.createEntityManager();
		Query q = entm.createQuery("Select u From Usuario u");
		usuarios = q.getResultList();
		entm.close();
		
		return usuarios;
	}
}
