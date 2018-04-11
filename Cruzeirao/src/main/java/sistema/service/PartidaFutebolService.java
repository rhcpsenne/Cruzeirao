package sistema.service;

import java.util.List;

import sistema.dao.PartidaFutebolDAO;
import sistema.modelos.PartidaFutebol;

public class PartidaFutebolService {
	PartidaFutebolDAO partidaFutebolDAO = new PartidaFutebolDAO();
	
	public PartidaFutebol salvar(PartidaFutebol partidaFutebol) {
		partidaFutebol = partidaFutebolDAO.save(partidaFutebol);
		partidaFutebolDAO.closeEntityManager();
		return partidaFutebol;
	}
	
	//@SuppressWarnings("unchecked")
	public List<PartidaFutebol> getPartidasFutebol(){
		List <PartidaFutebol> list = partidaFutebolDAO.getAll(PartidaFutebol.class);
		partidaFutebolDAO.closeEntityManager();
		return list;
	}
	
	public void alterar(PartidaFutebol partidaFutebol) {
		partidaFutebolDAO.save(partidaFutebol);
		partidaFutebolDAO.closeEntityManager();
	}

	
	public void remover(PartidaFutebol partidaFutebol) {
		partidaFutebol = partidaFutebolDAO.getById(PartidaFutebol.class, partidaFutebol.getNumero());
		partidaFutebolDAO.remove(partidaFutebol);
		partidaFutebolDAO.closeEntityManager();
	}
}
