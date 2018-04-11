package sistema.beans;

import java.util.List;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Cartao;
import sistema.service.CartaoService;

public class CartaoMB {
	private Cartao cartao = new Cartao();
	private List<Cartao> cartoes;
	private CartaoService service = new CartaoService();
	
	public void onRowEdit(RowEditEvent event) {

		Cartao c = ((Cartao) event.getObject());
		service.alterar(c);
	}

	public void salvar() {
		cartao = service.salvar(cartao);

		if (cartoes != null)
			cartoes.add(cartao);

		cartao = new Cartao();

	}

	public Cartao getAluno() {
		return cartao;
	}

	public void setAluno(Cartao cartao) {
		this.cartao = cartao;
	}

	// Retorna a lista de alunos para a tabela
	public List<Cartao> getCartoes() {
		if (cartoes == null)
			cartoes = service.getCartoes();

		return cartoes;
	}

	public void remover(Cartao cartao) {
		service.remover(cartao);
		cartoes.remove(cartao);

	}
}
