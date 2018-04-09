package sistema.beans;

import java.util.List;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Equipe;
import sistema.service.EquipeService;

public class EquipeMB {
	private Equipe equipe = new Equipe();
	private List<Equipe> equipes;
	private EquipeService service = new EquipeService();
	
	public void onRowEdit(RowEditEvent event) {

		Equipe e = ((Equipe) event.getObject());
		service.alterar(e);
	}

	public void salvar() {
		equipe = service.salvar(equipe);

		if (equipes != null)
			equipes.add(equipe);

		equipe = new Equipe();

	}

	public Equipe getAluno() {
		return equipe;
	}

	public void setAluno(Equipe equipe) {
		this.equipe = equipe;
	}

	// Retorna a lista de alunos para a tabela
	public List<Equipe> getEquipes() {
		if (equipes == null)
			equipes = service.getEquipes();

		return equipes;
	}

	public void remover(Equipe equipe) {
		service.remover(equipe);
		equipes.remove(equipe);

	}
}
