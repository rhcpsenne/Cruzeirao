package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Inscricao;
import sistema.service.InscricaoService;


@ManagedBean
@ViewScoped
public class InscricaoMB {
	private Inscricao inscricao = new Inscricao();
	public static List<Inscricao> inscricoes;
	private InscricaoService service = new InscricaoService();
	
	public void onRowEdit(RowEditEvent event) {

		Inscricao g = ((Inscricao) event.getObject());
		service.alterar(g);
	}

	public void salvar() {
		inscricao = service.salvar(inscricao);

		if (inscricoes != null)
			inscricoes.add(inscricao);

		inscricao = new Inscricao();

	}

	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	// Retorna a lista de alunos para a tabela
	public List<Inscricao> getInscricoes() {
		if (inscricoes == null)
			inscricoes = service.getInscricoes();

		return inscricoes;
	}

	public void remover(Inscricao inscricao) {
		service.remover(inscricao);
		inscricoes.remove(inscricao);
	}
}
