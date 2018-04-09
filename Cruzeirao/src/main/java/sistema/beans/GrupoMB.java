package sistema.beans;

import java.util.List;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Grupo;
import sistema.service.GrupoService;

public class GrupoMB {
	private Grupo grupo = new Grupo();
	private List<Grupo> grupos;
	private GrupoService service = new GrupoService();
	
	public void onRowEdit(RowEditEvent event) {

		Grupo g = ((Grupo) event.getObject());
		service.alterar(g);
	}

	public void salvar() {
		grupo = service.salvar(grupo);

		if (grupos != null)
			grupos.add(grupo);

		grupo = new Grupo();

	}

	public Grupo getAluno() {
		return grupo;
	}

	public void setAluno(Grupo grupo) {
		this.grupo = grupo;
	}

	// Retorna a lista de alunos para a tabela
	public List<Grupo> getGrupos() {
		if (grupos == null)
			grupos = service.getGrupos();

		return grupos;
	}

	public void remover(Grupo grupo) {
		service.remover(grupo);
		grupos.remove(grupo);
	}
}
