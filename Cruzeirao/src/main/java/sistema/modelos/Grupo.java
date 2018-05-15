package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Grupo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	@ManyToOne
	private Fase fase;
	@OneToMany(mappedBy="grupo", cascade=CascadeType.ALL)
	private ArrayList<Rodada> rodadas = new ArrayList<Rodada>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
