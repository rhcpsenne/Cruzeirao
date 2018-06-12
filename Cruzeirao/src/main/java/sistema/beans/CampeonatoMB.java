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
	
//	private Usuario usuario = new Usuario();
    
    private boolean skip;
     
//    public Usuario getUsuario() {
//        return usuario;
//    }
// 
//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }
//   
     
    public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
     
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   
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

        FacesMessage msg = new FacesMessage("Campeonato criado com sucesso!", "Campeonato: " + campeonato.getNome());
        FacesContext.getCurrentInstance().addMessage(null, msg);
		campeonato = service.salvar(campeonato);

		if (campeonatos != null)
			campeonatos.add(campeonato);

		campeonato = new Campeonato();

	}

//	public Campeonato getCampeonato() {
//		return campeonato;
//	}
//
//	public void setCampeonato(Campeonato campeonato) {
//		this.campeonato = campeonato;
//	}

	// Retorna a lista de campeonatos para a tabela
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
