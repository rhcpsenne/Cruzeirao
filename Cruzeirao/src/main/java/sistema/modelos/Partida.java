package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Partida implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num_partida;
	
	private Inscricao equipeMandante;
	private Inscricao equipeVisitante;
	private Date data;
	@ManyToOne
	private Local local;
	private Partida proxPartida;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="partida_juiz", joinColumns={@JoinColumn(name="ID_Partida")}, inverseJoinColumns={@JoinColumn(name="ID_Juiz")})
	private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	private Grupo grupo;
	private String relatoJuiz;
	@ManyToOne
	private Rodada rod;
	
	public Partida() {
		super();
	}
	
	
	public Partida(int num_partida, Inscricao equipeMandante, Inscricao equipeVisitante, Date data, Local local,
			Partida proxPartida, ArrayList<Juiz> juizes, Grupo grupo, String relatoJuiz) {
		super();
		this.num_partida = num_partida;
		this.equipeMandante = equipeMandante;
		this.equipeVisitante = equipeVisitante;
		this.data = data;
		this.local = local;
		this.proxPartida = proxPartida;
		this.juizes = juizes;
		this.grupo = grupo;
		this.relatoJuiz = relatoJuiz;
	}


	public ArrayList<Juiz> getJuizes() {
		return juizes;
	}
	public void setJuizes(ArrayList<Juiz> juizes) {
		this.juizes = juizes;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public int getNumero() {
		return num_partida;
	}
	public void setNumero(int num_partida) {
		this.num_partida = num_partida;
	}
	public Inscricao getEquipeMandante() {
		return equipeMandante;
	}
	public void setEquipeMandante(Inscricao equipeMandante) {
		this.equipeMandante = equipeMandante;
	}
	public Inscricao getEquipeVisitante() {
		return equipeVisitante;
	}
	public void setEquipeVisitante(Inscricao equipeVisitante) {
		this.equipeVisitante = equipeVisitante;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public Partida getProxPartida() {
		return proxPartida;
	}
	public void setProxPartida(Partida proxPartida) {
		this.proxPartida = proxPartida;
	}
	public String getRelatoJuiz() {
		return relatoJuiz;
	}
	public void setRelatoJuiz(String relatoJuiz) {
		this.relatoJuiz = relatoJuiz;
	}


	@Override
	public String toString() {
		return "Partida [num_partida=" + num_partida + ", equipeMandante=" + equipeMandante + ", equipeVisitante="
				+ equipeVisitante + ", data=" + data + ", local=" + local + ", proxPartida=" + proxPartida + ", juizes="
				+ juizes + ", grupo=" + grupo + ", relatoJuiz=" + relatoJuiz + "]";
	}
	
	
}
