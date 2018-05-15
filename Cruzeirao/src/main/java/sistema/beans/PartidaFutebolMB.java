package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.PartidaFutebol;
import sistema.service.PartidaFutebolService;

@ManagedBean
@ViewScoped
public class PartidaFutebolMB {
	private PartidaFutebol partidaFutebol = new PartidaFutebol();
	private List<PartidaFutebol> partidaFutebols;
	private PartidaFutebolService service = new PartidaFutebolService();
	
	public void onRowEdit(RowEditEvent event) {

		PartidaFutebol g = ((PartidaFutebol) event.getObject());
		service.alterar(g);
	}

	public void salvar() {
		partidaFutebol = service.salvar(partidaFutebol);

		if (partidaFutebols != null)
			partidaFutebols.add(partidaFutebol);

		partidaFutebol = new PartidaFutebol();

	}

	public PartidaFutebol getPartidaFutebol() {
		return partidaFutebol;
	}

	public void setPartidaFutebol(PartidaFutebol partidaFutebol) {
		this.partidaFutebol = partidaFutebol;
	}

	// Retorna a lista de alunos para a tabela
	public List<PartidaFutebol> getPartidasFutebol() {
		if (partidaFutebols == null)
			partidaFutebols = service.getPartidasFutebol();

		return partidaFutebols;
	}

	public void remover(PartidaFutebol partidaFutebol) {
		service.remover(partidaFutebol);
		partidaFutebols.remove(partidaFutebol);
	}
}
