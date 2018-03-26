package sistema.modelos;

import java.util.ArrayList;

public class Grupo {
	private String nome;
	private Fase fase;
	private ArrayList<Rodada> rodadas = new ArrayList<Rodada>();
	private int numero;
	//Gets E Sets & ToString
	public Grupo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grupo(String nome, Fase fase, ArrayList<Rodada> rodadas, int numero) {
		super();
		this.nome = nome;
		this.fase = fase;
		this.rodadas = rodadas;
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Fase getFase() {
		return fase;
	}
	public void setFase(Fase fase) {
		this.fase = fase;
	}
	public ArrayList<Rodada> getRodadas() {
		return rodadas;
	}
	public void setRodadas(ArrayList<Rodada> rodadas) {
		this.rodadas = rodadas;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Grupo [nome=" + nome + ", fase=" + fase + ", numero=" + numero + "]";
	}

}
