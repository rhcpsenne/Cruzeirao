package sistema.service;

import java.util.List;

import sistema.dao.EquipeDAO;
import sistema.modelos.Equipe;

public class EquipeService {
	EquipeDAO equipeDAO = new EquipeDAO();
	
	public Equipe salvar(Equipe equipe) {
		equipe = equipeDAO.save(equipe);
		equipeDAO.closeEntityManager();
		return equipe;
	}
	
	//@SuppressWarnings("unchecked")
	public List<Equipe> getEquipes(){
		List <Equipe> list = equipeDAO.getAll(Equipe.class);
		equipeDAO.closeEntityManager();
		return list;
	}
	
	public void alterar(Equipe equipe) {
		equipeDAO.save(equipe);
		equipeDAO.closeEntityManager();
	}

	
	public void remover(Equipe equipe) {
		equipe = equipeDAO.getById(Equipe.class, equipe.getId());
		equipeDAO.remove(equipe);
		equipeDAO.closeEntityManager();
	}
}
