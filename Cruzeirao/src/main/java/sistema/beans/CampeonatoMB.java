package sistema.beans;

import java.util.List;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Campeonato;
import sistema.service.CampeonatoService;

public class CampeonatoMB {
	private Campeonato campeonato = new Campeonato();
	private List<Campeonato> campeonatos;
	private CampeonatoService service = new CampeonatoService();
	
	public void onRowEdit(RowEditEvent event) {

		Campeonato c = ((Campeonato) event.getObject());
		service.alterar(c);
	}

	public void salvar() {
		campeonato = service.salvar(campeonato);

		if (campeonatos != null)
			campeonatos.add(campeonato);

		campeonato = new Campeonato();

	}

	public Campeonato getAluno() {
		return campeonato;
	}

	public void setAluno(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	// Retorna a lista de alunos para a tabela
	public List<Campeonato> getCampeonatos() {
		if (campeonatos == null)
			campeonatos = service.getCampeonatos();

		return campeonatos;
	}

	public void remover(Campeonato campeonato) {
		service.remover(campeonato);
		campeonatos.remove(campeonato);

	}
}
