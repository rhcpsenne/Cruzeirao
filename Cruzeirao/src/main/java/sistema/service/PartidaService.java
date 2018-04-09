package sistema.service;

import java.util.List;
import sistema.dao.PartidaDAO;
import sistema.modelos.Partida;

public class PartidaService {
	PartidaDAO partidaDAO = new PartidaDAO();
	
	public Partida salvar(Partida partida) {
		partida = partidaDAO.save(partida);
		partidaDAO.closeEntityManager();
		return partida;
	}
	
	//@SuppressWarnings("unchecked")
	public List<Partida> getPartidas(){
		List <Partida> list = partidaDAO.getAll(Partida.class);
		partidaDAO.closeEntityManager();
		return list;
	}
	
	public void alterar(Partida partida) {
		partidaDAO.save(partida);
		partidaDAO.closeEntityManager();
	}

	
	public void remover(Partida partida) {
		partida = partidaDAO.getById(Partida.class, partida.getNumero());
		partidaDAO.remove(partida);
		partidaDAO.closeEntityManager();
	}
}
