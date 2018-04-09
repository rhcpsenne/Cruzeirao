package sistema.service;

import java.util.List;


import sistema.dao.GolDAO;
import sistema.modelos.Gol;

public class GolService {
	GolDAO golDAO = new GolDAO();
	
	public Gol salvar(Gol gol) {
		gol = golDAO.save(gol);
		golDAO.closeEntityManager();
		return gol;
	}
	
	//@SuppressWarnings("unchecked")
	public List<Gol> getGols(){
		List <Gol> list = golDAO.getAll(Gol.class);
		golDAO.closeEntityManager();
		return list;
	}
	
	public void alterar(Gol gol) {
		golDAO.save(gol);
		golDAO.closeEntityManager();
	}

	
	public void remover(Gol gol) {
		gol = golDAO.getById(Gol.class, gol.getId());
		golDAO.remove(gol);
		golDAO.closeEntityManager();
	}
}
