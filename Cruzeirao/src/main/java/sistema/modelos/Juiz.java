package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import enumerator.Tipo;

@Entity
@PrimaryKeyJoinColumn(name="id_usuario")
public class Juiz extends Usuario{
	private Tipo tipo;
	private Usuario usuario;

	
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
