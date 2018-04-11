package sistema.service;

import java.util.List;

import sistema.dao.RodadaDAO;
import sistema.modelos.Rodada;

public class RodadaService {
	RodadaDAO rodadaDAO = new RodadaDAO();
	
	public Rodada salvar(Rodada rodada) {
		rodada = rodadaDAO.save(rodada);
		rodadaDAO.closeEntityManager();
		return rodada;
	}
	
	//@SuppressWarnings("unchecked")
	public List<Rodada> getRodadas(){
		List <Rodada> list = rodadaDAO.getAll(Rodada.class);
		rodadaDAO.closeEntityManager();
		return list;
	}
	
	public void alterar(Rodada rodada) {
		rodadaDAO.save(rodada);
		rodadaDAO.closeEntityManager();
	}

	
	public void remover(Rodada rodada) {
		rodada = rodadaDAO.getById(Rodada.class, rodada.getNumero());
		rodadaDAO.remove(rodada);
		rodadaDAO.closeEntityManager();
	}
}
