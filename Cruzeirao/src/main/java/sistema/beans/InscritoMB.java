package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Inscrito;
import sistema.service.InscritoService;


@ManagedBean
@ViewScoped
public class InscritoMB {
	private Inscrito inscrito = new Inscrito();
	private List<Inscrito> inscritos;
	private InscritoService service = new InscritoService();
	
	public void onRowEdit(RowEditEvent event) {

		Inscrito g = ((Inscrito) event.getObject());
		service.alterar(g);
	}

	public void salvar() {
		inscrito = service.salvar(inscrito);

		if (inscritos != null)
			inscritos.add(inscrito);

		inscrito = new Inscrito();

	}

	public Inscrito getInscrito() {
		return inscrito;
	}

	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}

	// Retorna a lista de alunos para a tabela
	public List<Inscrito> getInscritos() {
		if (inscritos == null)
			inscritos = service.getInscritos();

		return inscritos;
	}

	public void remover(Inscrito inscrito) {
		service.remover(inscrito);
		inscritos.remove(inscrito);
	}
}
