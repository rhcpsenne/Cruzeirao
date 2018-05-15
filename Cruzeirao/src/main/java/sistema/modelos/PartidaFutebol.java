package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="num_partida")
public class PartidaFutebol extends Partida implements Serializable {

	private static final long serialVersionUID = 1L;
	private ArrayList<Gol> golsMandantes  = new ArrayList<Gol>();
	private ArrayList<Gol> golsVisitantes = new ArrayList<Gol>();
	private ArrayList<Gol> golsPenaltesMandantes = new ArrayList<Gol>();
	private ArrayList<Gol> golsPenaltesVisitantes = new ArrayList<Gol>();
	private ArrayList<Cartao> cartoesMandante = new ArrayList<Cartao>();
	private ArrayList<Cartao> cartoesVisitantes = new ArrayList<Cartao>();
	//Gets E Sets & ToString
	public PartidaFutebol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PartidaFutebol(ArrayList<Gol> golsMandantes, ArrayList<Gol> golsVisitantes,
			ArrayList<Gol> golsPenaltesMandantes, ArrayList<Gol> golsPenaltesVisitantes,
			ArrayList<Cartao> cartoesMandante, ArrayList<Cartao> cartoesVisitantes) {
		super();
		this.golsMandantes = golsMandantes;
		this.golsVisitantes = golsVisitantes;
		this.golsPenaltesMandantes = golsPenaltesMandantes;
		this.golsPenaltesVisitantes = golsPenaltesVisitantes;
		this.cartoesMandante = cartoesMandante;
		this.cartoesVisitantes = cartoesVisitantes;
	}
	public ArrayList<Gol> getGolsMandantes() {
		return golsMandantes;
	}
	public void setGolsMandantes(ArrayList<Gol> golsMandantes) {
		this.golsMandantes = golsMandantes;
	}
	public ArrayList<Gol> getGolsVisitantes() {
		return golsVisitantes;
	}
	public void setGolsVisitantes(ArrayList<Gol> golsVisitantes) {
		this.golsVisitantes = golsVisitantes;
	}
	public ArrayList<Gol> getGolsPenaltesMandantes() {
		return golsPenaltesMandantes;
	}
	public void setGolsPenaltesMandantes(ArrayList<Gol> golsPenaltesMandantes) {
		this.golsPenaltesMandantes = golsPenaltesMandantes;
	}
	public ArrayList<Gol> getGolsPenaltesVisitantes() {
		return golsPenaltesVisitantes;
	}
	public void setGolsPenaltesVisitantes(ArrayList<Gol> golsPenaltesVisitantes) {
		this.golsPenaltesVisitantes = golsPenaltesVisitantes;
	}
	public ArrayList<Cartao> getCartoesMandante() {
		return cartoesMandante;
	}
	public void setCartoesMandante(ArrayList<Cartao> cartoesMandante) {
		this.cartoesMandante = cartoesMandante;
	}
	public ArrayList<Cartao> getCartoesVisitantes() {
		return cartoesVisitantes;
	}
	public void setCartoesVisitantes(ArrayList<Cartao> cartoesVisitantes) {
		this.cartoesVisitantes = cartoesVisitantes;
	}
	@Override
	public String toString() {
		return "PartidaFutebol []";
	}
}
