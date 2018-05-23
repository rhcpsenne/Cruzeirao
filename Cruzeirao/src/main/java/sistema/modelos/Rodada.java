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
public class Rodada implements Serializable {

	private static final long serialVersionUID = 1L;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grupo == null) ? 0 : grupo.hashCode());
		result = prime * result + numero_rod;
		result = prime * result + ((partidas == null) ? 0 : partidas.hashCode());
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
		Rodada other = (Rodada) obj;
		if (grupo == null) {
			if (other.grupo != null)
				return false;
		} else if (!grupo.equals(other.grupo))
			return false;
		if (numero_rod != other.numero_rod)
			return false;
		if (partidas == null) {
			if (other.partidas != null)
				return false;
		} else if (!partidas.equals(other.partidas))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rodada [numero=" + numero_rod + ", grupo=" + grupo + ", partidas=" + partidas + "]";
	}
}
