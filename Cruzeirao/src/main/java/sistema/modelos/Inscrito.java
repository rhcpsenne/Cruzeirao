package sistema.modelos;

public class Inscrito {
	//private Enum tipo;
	private Usuario usuario;
	private Inscricao inscricao;
	private boolean aceiteUsuario;
	private boolean suspensoJogos;
	private boolean inscricaoValidada;
	
	public Inscrito() {
		super();
	}
	public Inscrito(Usuario usuario, Inscricao inscricao, boolean aceiteUsuario, boolean suspensoJogos,
			boolean inscricaoValidada) {
		super();
		this.usuario = usuario;
		this.inscricao = inscricao;
		this.aceiteUsuario = aceiteUsuario;
		this.suspensoJogos = suspensoJogos;
		this.inscricaoValidada = inscricaoValidada;
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
		return "Inscrito [usuario=" + usuario + ", inscricao=" + inscricao + ", aceiteUsuario=" + aceiteUsuario + ", suspensoJogos="
				+ suspensoJogos + ", inscricaoValidade" + inscricaoValidada + "]";
	}
}
