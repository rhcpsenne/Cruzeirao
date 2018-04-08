package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gol {
	@Id
	private int id;
	private Inscrito inscrito;
	private int tempo;
	private boolean penalty;
	//Gets E Sets & ToString
	public Gol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gol(int id, Inscrito inscrito, int tempo, boolean penalty) {
		super();
		this.id = id;
		this.inscrito = inscrito;
		this.tempo = tempo;
		this.penalty = penalty;
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
	public boolean isPenalty() {
		return penalty;
	}
	public void setPenalty(boolean penalty) {
		this.penalty = penalty;
	}
	@Override
	public String toString() {
		return "Gol [id=" + id + ", inscrito=" + inscrito + ", tempo=" + tempo + ", penalty=" + penalty + "]";
	}
	
}
