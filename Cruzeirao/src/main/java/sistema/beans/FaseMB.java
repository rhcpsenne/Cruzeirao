package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Fase;
import sistema.service.FaseService;

@ManagedBean
@ViewScoped
public class FaseMB {
	private Fase fase = new Fase();
	private List<Fase> fases;
	private FaseService service = new FaseService();
	
	public void onRowEdit(RowEditEvent event) {

		Fase f = ((Fase) event.getObject());
		service.alterar(f);
	}

	public void salvar() {
		fase = service.salvar(fase);

		if (fases != null)
			fases.add(fase);

		fase = new Fase();

	}

	public Fase getAluno() {
		return fase;
	}

	public void setAluno(Fase fase) {
		this.fase = fase;
	}

	// Retorna a lista de alunos para a tabela
	public List<Fase> getFases() {
		if (fases == null)
			fases = service.getFases();

		return fases;
	}

	public void remover(Fase fase) {
		service.remover(fase);
		fases.remove(fase);

	}
}
