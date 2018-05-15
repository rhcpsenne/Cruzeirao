package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Rodada;
import sistema.service.RodadaService;

@ManagedBean
@ViewScoped
public class RodadaMB {
	private Rodada rodada = new Rodada();
	private List<Rodada> rodadas;
	private RodadaService service = new RodadaService();
	
	public void onRowEdit(RowEditEvent event) {

		Rodada g = ((Rodada) event.getObject());
		service.alterar(g);
	}

	public void salvar() {
		rodada = service.salvar(rodada);

		if (rodadas != null)
			rodadas.add(rodada);

		rodada = new Rodada();

	}

	public Rodada getRodada() {
		return rodada;
	}

	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}

	// Retorna a lista de alunos para a tabela
	public List<Rodada> getRodadas() {
		if (rodadas == null)
			rodadas = service.getRodadas();

		return rodadas;
	}

	public void remover(Rodada rodada) {
		service.remover(rodada);
		rodadas.remove(rodada);
	}
}
