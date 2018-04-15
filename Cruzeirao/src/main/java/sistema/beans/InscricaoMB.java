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
	private List<Inscricao> inscricaos;
	private InscricaoService service = new InscricaoService();
	
	public void onRowEdit(RowEditEvent event) {

		Inscricao g = ((Inscricao) event.getObject());
		service.alterar(g);
	}

	public void salvar() {
		inscricao = service.salvar(inscricao);

		if (inscricaos != null)
			inscricaos.add(inscricao);

		inscricao = new Inscricao();

	}

	public Inscricao getAluno() {
		return inscricao;
	}

	public void setAluno(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	// Retorna a lista de alunos para a tabela
	public List<Inscricao> getInscricoes() {
		if (inscricaos == null)
			inscricaos = service.getInscricoes();

		return inscricaos;
	}

	public void remover(Inscricao inscricao) {
		service.remover(inscricao);
		inscricaos.remove(inscricao);
	}
}
