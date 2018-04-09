package sistema.service;

import java.util.List;

import sistema.dao.CartaoDAO;
import sistema.modelos.Cartao;

public class CartaoService {
	CartaoDAO cartaoDAO = new CartaoDAO();
	
	public Cartao salvar(Cartao cartao) {
		cartao = cartaoDAO.save(cartao);
		cartaoDAO.closeEntityManager();
		return cartao;
	}
	
	//@SuppressWarnings("unchecked")
	public List<Cartao> getCartoes(){
		List <Cartao> list = cartaoDAO.getAll(Cartao.class);
		cartaoDAO.closeEntityManager();
		return list;
	}
	
	public void alterar(Cartao cartao) {
		cartaoDAO.save(cartao);
		cartaoDAO.closeEntityManager();
	}

	
	public void remover(Cartao cartao) {
		cartao = cartaoDAO.getById(Cartao.class, cartao.getId());
		cartaoDAO.remove(cartao);
		cartaoDAO.closeEntityManager();
	}
}
