package sistema.modelos;

public class Juiz {
	private Enum tipo;
	private Usuario usuario;

	
	public Juiz() {
		super();
	}
	public Juiz(Enum tipo, Usuario usuario) {
		super();
		this.tipo = tipo;
		this.usuario = usuario;
	}
	public Enum getTipo() {
		return tipo;
	}
	public void setTipo(Enum tipo) {
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
