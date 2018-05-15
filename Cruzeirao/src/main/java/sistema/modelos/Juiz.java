package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import enumerator.Tipo;

@Entity
@PrimaryKeyJoinColumn(name="id_usuario")
public class Juiz extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	private Tipo tipo;
	@OneToOne(cascade=CascadeType.ALL)
	private Usuario usuario;
	@ManyToMany(mappedBy="juizes", cascade=CascadeType.ALL)
	private ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();
	@ManyToMany(mappedBy="juizes", cascade=CascadeType.ALL)
	private ArrayList<Partida> partidas = new ArrayList<Partida>();

	
	public Juiz() {
		super();
	}
	public Juiz(Tipo tipo, Usuario usuario) {
		super();
		this.tipo = tipo;
		this.usuario = usuario;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	 public String toString() {
	  return "Juiz [tipo=" + tipo + ", usuario=" + usuario + "]";
	 }
}
