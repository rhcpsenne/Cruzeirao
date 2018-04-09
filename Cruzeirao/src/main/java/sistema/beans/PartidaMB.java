package sistema.beans;

import java.util.List;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Partida;
import sistema.service.PartidaService;

public class PartidaMB {
	private Partida partida = new Partida();
	private List<Partida> partidas;
	private PartidaService service = new PartidaService();
	
	public void onRowEdit(RowEditEvent event) {

		Partida g = ((Partida) event.getObject());
		service.alterar(g);
	}

	public void salvar() {
		partida = service.salvar(partida);

		if (partidas != null)
			partidas.add(partida);

		partida = new Partida();

	}

	public Partida getAluno() {
		return partida;
	}

	public void setAluno(Partida partida) {
		this.partida = partida;
	}

	// Retorna a lista de alunos para a tabela
	public List<Partida> getPartidas() {
		if (partidas == null)
			partidas = service.getPartidas();

		return partidas;
	}

	public void remover(Partida partida) {
		service.remover(partida);
		partidas.remove(partida);
	}
}
