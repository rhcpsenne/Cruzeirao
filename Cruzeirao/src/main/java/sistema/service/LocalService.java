package sistema.service;

import java.util.List;
import sistema.dao.LocalDAO;
import sistema.modelos.Local;

public class LocalService {
	LocalDAO localDAO = new LocalDAO();
	
	public Local salvar(Local local) {
		local = localDAO.save(local);
		localDAO.closeEntityManager();
		return local;
	}
	
	//@SuppressWarnings("unchecked")
	public List<Local> getLocais(){
		List <Local> list = localDAO.getAll(Local.class);
		localDAO.closeEntityManager();
		return list;
	}
	
	public void alterar(Local local) {
		localDAO.save(local);
		localDAO.closeEntityManager();
	}

	
	public void remover(Local local) {
		local = localDAO.getById(Local.class, local.getId());
		localDAO.remove(local);
		localDAO.closeEntityManager();
	}
}
