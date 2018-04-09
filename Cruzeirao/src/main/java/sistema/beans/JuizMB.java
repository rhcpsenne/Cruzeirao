package sistema.beans;

import java.util.List;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Juiz;
import sistema.service.JuizService;

public class JuizMB {
	private Juiz juiz = new Juiz();
	private List<Juiz> juizs;
	private JuizService service = new JuizService();
	
	public void onRowEdit(RowEditEvent event) {

		Juiz g = ((Juiz) event.getObject());
		service.alterar(g);
	}

	public void salvar() {
		juiz = service.salvar(juiz);

		if (juizs != null)
			juizs.add(juiz);

		juiz = new Juiz();

	}

	public Juiz getAluno() {
		return juiz;
	}

	public void setAluno(Juiz juiz) {
		this.juiz = juiz;
	}

	// Retorna a lista de alunos para a tabela
	public List<Juiz> getJuizes() {
		if (juizs == null)
			juizs = service.getJuizes();

		return juizs;
	}

	public void remover(Juiz juiz) {
		service.remover(juiz);
		juizs.remove(juiz);
	}
}
