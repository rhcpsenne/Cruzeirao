package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Local;
import sistema.service.LocalService;


@ManagedBean
@ViewScoped
public class LocalMB {
	private Local local = new Local();
	public static List<Local> locais;
	private LocalService service = new LocalService();
	
	public void onRowEdit(RowEditEvent event) {

		Local g = ((Local) event.getObject());
		service.alterar(g);
	}

	public void salvar() {
		local = service.salvar(local);

		if (locais != null)
			locais.add(local);

		local = new Local();

	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	// Retorna a lista de alunos para a tabela
	public List<Local> getLocais() {
		if (locais == null)
			locais = service.getLocais();

		return locais;
	}

	public void remover(Local local) {
		service.remover(local);
		locais.remove(local);
	}
}
