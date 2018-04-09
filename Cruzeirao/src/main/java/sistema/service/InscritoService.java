package sistema.service;

import java.util.List;

import sistema.dao.InscritoDAO;
import sistema.modelos.Inscrito;

public class InscritoService {
	InscritoDAO inscritoDAO = new InscritoDAO();
	
	public Inscrito salvar(Inscrito inscrito) {
		inscrito = inscritoDAO.save(inscrito);
		inscritoDAO.closeEntityManager();
		return inscrito;
	}
	
	//@SuppressWarnings("unchecked")
	public List<Inscrito> getInscritos(){
		List <Inscrito> list = inscritoDAO.getAll(Inscrito.class);
		inscritoDAO.closeEntityManager();
		return list;
	}
	
	public void alterar(Inscrito inscrito) {
		inscritoDAO.save(inscrito);
		inscritoDAO.closeEntityManager();
	}

	
	public void remover(Inscrito inscrito) {
		inscrito = inscritoDAO.getById(Inscrito.class, inscrito.getId());
		inscritoDAO.remove(inscrito);
		inscritoDAO.closeEntityManager();
	}
}
