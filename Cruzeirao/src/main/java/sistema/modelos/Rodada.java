package sistema.modelos;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Rodada {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int numero_rod;
	@ManyToOne
	private Grupo grupo;
	@OneToMany(mappedBy="rod", cascade=CascadeType.ALL)
	private ArrayList<Partida> partidas = new ArrayList<Partida>();
	//Gets E Sets & ToString
	public Rodada() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rodada(int numero_rod, Grupo grupo, ArrayList<Partida> partidas) {
		super();
		this.numero_rod = numero_rod;
		this.grupo = grupo;
		this.partidas = partidas;
	}
	public int getNumero() {
		return numero_rod;
	}
	public void setNumero(int numero_rod) {
		this.numero_rod = numero_rod;
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
		return "Rodada [numero=" + numero_rod + ", grupo=" + grupo + ", partidas=" + partidas + "]";
	}
}
