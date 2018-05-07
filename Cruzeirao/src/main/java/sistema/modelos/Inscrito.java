package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import enumerator.Tipo;

@Entity
@PrimaryKeyJoinColumn(name="id_usuario")
public class Inscrito extends Usuario{
	private Tipo tipo;
	@ManyToOne
	private Usuario usuario;
	private Inscricao inscricao;
	private boolean aceiteUsuario;
	private boolean suspensoJogos;
	private boolean inscricaoValidada;
	
	public Inscrito() {
		super();
	}
	
	
	public Inscrito(Tipo tipo, Usuario usuario, Inscricao inscricao, boolean aceiteUsuario, boolean suspensoJogos,
			boolean inscricaoValidada) {
		super();
		this.tipo = tipo;
		this.usuario = usuario;
		this.inscricao = inscricao;
		this.aceiteUsuario = aceiteUsuario;
		this.suspensoJogos = suspensoJogos;
		this.inscricaoValidada = inscricaoValidada;
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
	public Inscricao getInscricao() {
		return inscricao;
	}
	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}
	public boolean isAceiteUsuario() {
		return aceiteUsuario;
	}
	public void setAceiteUsuario(boolean aceiteUsuario) {
		this.aceiteUsuario = aceiteUsuario;
	}
	public boolean isSuspensoJogos() {
		return suspensoJogos;
	}
	public void setSuspensoJogos(boolean suspensoJogos) {
		this.suspensoJogos = suspensoJogos;
	}
	public boolean isInscricaoValidada() {
		return inscricaoValidada;
	}
	public void setInscricaoValidada(boolean inscricaoValidada) {
		this.inscricaoValidada = inscricaoValidada;
	}


	@Override
	public String toString() {
		return "Inscrito [tipo=" + tipo + ", usuario=" + usuario + ", inscricao=" + inscricao + ", aceiteUsuario="
				+ aceiteUsuario + ", suspensoJogos=" + suspensoJogos + ", inscricaoValidada=" + inscricaoValidada + "]";
	}
	
	
}
