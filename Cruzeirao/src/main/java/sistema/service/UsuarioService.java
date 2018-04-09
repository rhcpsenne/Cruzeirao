package sistema.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import sistema.dao.UsuarioDAO;
import sistema.modelos.Usuario;

public class UsuarioService {
	private EntityManagerFactory emf;
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public UsuarioService() {
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public Usuario salvar(Usuario usuario) {
		usuario = usuarioDAO.save(usuario);
		usuarioDAO.closeEntityManager();
		return usuario;
	}
	
	//@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios(){
		List <Usuario> list = usuarioDAO.getAll(Usuario.class);
		usuarioDAO.closeEntityManager();
		return list;
	}
	
	public void alterar(Usuario usuario) {
		usuarioDAO.save(usuario);
		usuarioDAO.closeEntityManager();
	}

	
	public void remover(Usuario usuario) {
		usuario = usuarioDAO.getById(Usuario.class, usuario.getId());
		usuarioDAO.remove(usuario);
		usuarioDAO.closeEntityManager();
	}
}
