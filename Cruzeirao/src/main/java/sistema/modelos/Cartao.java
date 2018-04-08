package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

import enumerator.Tipo;

@Entity
public class Cartao {
	@Id
	private int id;
	private Inscrito inscrito;
	private Tipo tipo;
	private int tempo;
	//Gets E Sets & ToString
	public Cartao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cartao(int id, Inscrito inscrito, Tipo tipo, int tempo) {
		super();
		this.id = id;
		this.inscrito = inscrito;
		this.tipo = tipo;
		this.tempo = tempo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Cartao [id=" + id + ", inscrito=" + inscrito + ", tipo=" + tipo + ", tempo=" + tempo + "]";
	}
	
}
