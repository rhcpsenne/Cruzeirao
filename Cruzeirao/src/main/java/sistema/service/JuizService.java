package sistema.service;

import java.util.List;

import sistema.dao.JuizDAO;
import sistema.modelos.Juiz;

public class JuizService {
	JuizDAO juizDAO = new JuizDAO();
	
	public Juiz salvar(Juiz juiz) {
		juiz = juizDAO.save(juiz);
		juizDAO.closeEntityManager();
		return juiz;
	}
	
	//@SuppressWarnings("unchecked")
	public List<Juiz> getJuizes(){
		List <Juiz> list = juizDAO.getAll(Juiz.class);
		juizDAO.closeEntityManager();
		return list;
	}
	
	public void alterar(Juiz juiz) {
		juizDAO.save(juiz);
		juizDAO.closeEntityManager();
	}

	
	public void remover(Juiz juiz) {
		juiz = juizDAO.getById(Juiz.class, juiz.getId());
		juizDAO.remove(juiz);
		juizDAO.closeEntityManager();
	}
}
