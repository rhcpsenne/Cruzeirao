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


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((equipeMandante == null) ? 0 : equipeMandante.hashCode());
		result = prime * result + ((equipeVisitante == null) ? 0 : equipeVisitante.hashCode());
		result = prime * result + ((grupo == null) ? 0 : grupo.hashCode());
		result = prime * result + ((juizes == null) ? 0 : juizes.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + num_partida;
		result = prime * result + ((proxPartida == null) ? 0 : proxPartida.hashCode());
		result = prime * result + ((relatoJuiz == null) ? 0 : relatoJuiz.hashCode());
		result = prime * result + ((rod == null) ? 0 : rod.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partida other = (Partida) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (equipeMandante == null) {
			if (other.equipeMandante != null)
				return false;
		} else if (!equipeMandante.equals(other.equipeMandante))
			return false;
		if (equipeVisitante == null) {
			if (other.equipeVisitante != null)
				return false;
		} else if (!equipeVisitante.equals(other.equipeVisitante))
			return false;
		if (grupo == null) {
			if (other.grupo != null)
				return false;
		} else if (!grupo.equals(other.grupo))
			return false;
		if (juizes == null) {
			if (other.juizes != null)
				return false;
		} else if (!juizes.equals(other.juizes))
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (num_partida != other.num_partida)
			return false;
		if (proxPartida == null) {
			if (other.proxPartida != null)
				return false;
		} else if (!proxPartida.equals(other.proxPartida))
			return false;
		if (relatoJuiz == null) {
			if (other.relatoJuiz != null)
				return false;
		} else if (!relatoJuiz.equals(other.relatoJuiz))
			return false;
		if (rod == null) {
			if (other.rod != null)
				return false;
		} else if (!rod.equals(other.rod))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Partida [num_partida=" + num_partida + ", equipeMandante=" + equipeMandante + ", equipeVisitante="
				+ equipeVisitante + ", data=" + data + ", local=" + local + ", proxPartida=" + proxPartida + ", juizes="
				+ juizes + ", grupo=" + grupo + ", relatoJuiz=" + relatoJuiz + "]";
	}
	
	
}
