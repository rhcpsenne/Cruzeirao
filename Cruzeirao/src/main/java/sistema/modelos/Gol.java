package sistema.modelos;

public class Gol {
	private Inscrito inscrito;
	private int tempo;
	private boolean penalty;
	//Gets E Sets & ToString
	public Gol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gol(Inscrito inscrito, int tempo, boolean penalty) {
		super();
		this.inscrito = inscrito;
		this.tempo = tempo;
		this.penalty = penalty;
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
		return "Gol [inscrito=" + inscrito + ", tempo=" + tempo + ", penalty=" + penalty + "]";
	}
}
