package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Gol;
import sistema.service.GolService;

@ManagedBean
@ViewScoped
public class GolMB {
	private Gol gol = new Gol();
	private List<Gol> gols;
	private GolService service = new GolService();
	
	public void onRowEdit(RowEditEvent event) {

		Gol g = ((Gol) event.getObject());
		service.alterar(g);
	}

	public void salvar() {
		gol = service.salvar(gol);

		if (gols != null)
			gols.add(gol);

		gol = new Gol();

	}

	public Gol getGol() {
		return gol;
	}

	public void setGol(Gol gol) {
		this.gol = gol;
	}

	// Retorna a lista de alunos para a tabela
	public List<Gol> getGols() {
		if (gols == null)
			gols = service.getGols();

		return gols;
	}

	public void remover(Gol gol) {
		service.remover(gol);
		gols.remove(gol);
	}
}
