package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Local implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int local_id;
	private String nome;
	@ManyToMany(mappedBy="locais", cascade=CascadeType.ALL)
	private ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();
	@OneToMany(mappedBy="local", cascade=CascadeType.ALL)
	private ArrayList<Partida> partidas = new ArrayList<Partida>();
	
	
	private String endereco;
	
	
	public Local(int local_id, String endereco) {
		super();
		this.local_id = local_id;
		this.endereco = endereco;
	}

	public Local() {
		super();
	}
	

	public int getId() {
		return local_id;
	}

	public void setId(int local_id) {
		this.local_id = local_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((campeonatos == null) ? 0 : campeonatos.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + local_id;
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
		Local other = (Local) obj;
		if (campeonatos == null) {
			if (other.campeonatos != null)
				return false;
		} else if (!campeonatos.equals(other.campeonatos))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (local_id != other.local_id)
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
		return "Local [endereco=" + endereco + "]";
	}
}
