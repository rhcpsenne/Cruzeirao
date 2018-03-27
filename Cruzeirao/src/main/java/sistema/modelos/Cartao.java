package sistema.modelos;

public class Cartao {
	private Inscrito inscrito;
	private Enum tipo;
	private int tempo;
	//Gets E Sets & ToString
	public Cartao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cartao(Inscrito inscrito, Enum tipo, int tempo) {
		super();
		this.inscrito = inscrito;
		this.tipo = tipo;
		this.tempo = tempo;
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
	public Enum getTipo() {
		return tipo;
	}
	public void setTipo(Enum tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Cartao [inscrito=" + inscrito + ", tipo=" + tipo + ", tempo=" + tempo + "]";
	}
}
