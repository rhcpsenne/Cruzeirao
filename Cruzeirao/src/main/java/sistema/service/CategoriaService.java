package sistema.service;

import java.util.List;

import sistema.dao.CategoriaDAO;
import sistema.modelos.Categoria;


public class CategoriaService {
	CategoriaDAO categoriaDAO = new CategoriaDAO();
	
	public Categoria salvar(Categoria categoria) {
		categoria = categoriaDAO.save(categoria);
		categoriaDAO.closeEntityManager();
		return categoria;
	}
	
	//@SuppressWarnings("unchecked")
	public List<Categoria> getCategorias(){
		List <Categoria> list = categoriaDAO.getAll(Categoria.class);
		categoriaDAO.closeEntityManager();
		return list;
	}
	
	public void alterar(Categoria categoria) {
		categoriaDAO.save(categoria);
		categoriaDAO.closeEntityManager();
	}

	
	public void remover(Categoria categoria) {
		categoria = categoriaDAO.getById(Categoria.class, categoria.getId());
		categoriaDAO.remove(categoria);
		categoriaDAO.closeEntityManager();
	}
}
