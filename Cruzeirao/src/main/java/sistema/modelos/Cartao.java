package sistema.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import enumerator.Tipo;

@Entity
public class Cartao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cartao_id;
	private Inscrito inscrito;
	private Tipo tipo;
	private int tempo;
	//Gets E Sets & ToString
	public Cartao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cartao(int cartao_id, Inscrito inscrito, Tipo tipo, int tempo) {
		super();
		this.cartao_id = cartao_id;
		this.inscrito = inscrito;
		this.tipo = tipo;
		this.tempo = tempo;
	}
	
	public int getId() {
		return cartao_id;
	}
	public void setId(int cartao_id) {
		this.cartao_id = cartao_id;
	}
	public Inscrito getInscrito() {
		return inscrito;
	}
	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Cartao [cartao_id=" + cartao_id + ", inscrito=" + inscrito + ", tipo=" + tipo + ", tempo=" + tempo + "]";
	}
	
}
