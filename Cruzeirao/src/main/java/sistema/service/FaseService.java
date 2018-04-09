package sistema.service;

import java.util.List;


import sistema.dao.FaseDAO;
import sistema.modelos.Fase;
public class FaseService {
	FaseDAO faseDAO = new FaseDAO();
	
	public Fase salvar(Fase fase) {
		fase = faseDAO.save(fase);
		faseDAO.closeEntityManager();
		return fase;
	}
	
	//@SuppressWarnings("unchecked")
	public List<Fase> getFases(){
		List <Fase> list = faseDAO.getAll(Fase.class);
		faseDAO.closeEntityManager();
		return list;
	}
	
	public void alterar(Fase fase) {
		faseDAO.save(fase);
		faseDAO.closeEntityManager();
	}

	
	public void remover(Fase fase) {
		fase = faseDAO.getById(Fase.class, fase.getNumero());
		faseDAO.remove(fase);
		faseDAO.closeEntityManager();
	}
}
