package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gol {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int gol_id;
	private Inscrito inscrito;
	private int tempo;
	private boolean penalty;
	//Gets E Sets & ToString
	public Gol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gol(int gol_id, Inscrito inscrito, int tempo, boolean penalty) {
		super();
		this.gol_id = gol_id;
		this.inscrito = inscrito;
		this.tempo = tempo;
		this.penalty = penalty;
	}
	
	public int getId() {
		return gol_id;
	}
	public void setId(int gol_id) {
		this.gol_id = gol_id;
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
		return "Gol [id=" + gol_id + ", inscrito=" + inscrito + ", tempo=" + tempo + ", penalty=" + penalty + "]";
	}
	
}
