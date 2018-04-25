package sistema.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;
import org.primefaces.event.RowEditEvent;

import sistema.modelos.Campeonato;
import sistema.modelos.Usuario;
import sistema.service.CampeonatoService;

@ManagedBean
@ViewScoped
public class CampeonatoMB {
	private Campeonato campeonato = new Campeonato();
	private List<Campeonato> campeonatos;
	private CampeonatoService service = new CampeonatoService();
	
	private Usuario usuario = new Usuario();
    
    private boolean skip;
     
    public Usuario getUsuario() {
        return usuario;
    }
 
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
     
    public void save() {        
        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + usuario.getNome());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
     
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case usuario goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }
	
	public void onRowEdit(RowEditEvent event) {

		Campeonato c = ((Campeonato) event.getObject());
		service.alterar(c);
	}

	public void salvar() {
		campeonato = service.salvar(campeonato);

		if (campeonatos != null)
			campeonatos.add(campeonato);

		campeonato = new Campeonato();

	}

	public Campeonato getAluno() {
		return campeonato;
	}

	public void setAluno(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	// Retorna a lista de alunos para a tabela
	public List<Campeonato> getCampeonatos() {
		if (campeonatos == null)
			campeonatos = service.getCampeonatos();

		return campeonatos;
	}

	public void remover(Campeonato campeonato) {
		service.remover(campeonato);
		campeonatos.remove(campeonato);

	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	
	
}
