package sistema.modelos;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rodada {
	@Id
	private int numero;
	private Grupo grupo;
	private ArrayList<Partida> partidas = new ArrayList<Partida>();
	//Gets E Sets & ToString
	public Rodada() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rodada(int numero, Grupo grupo, ArrayList<Partida> partidas) {
		super();
		this.numero = numero;
		this.grupo = grupo;
		this.partidas = partidas;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	@Override
	public String toString() {
		return "Rodada [numero=" + numero + ", grupo=" + grupo + ", partidas=" + partidas + "]";
	}
}
