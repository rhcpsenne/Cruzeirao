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
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fase == null) ? 0 : fase.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numero;
		result = prime * result + ((rodadas == null) ? 0 : rodadas.hashCode());
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
		Grupo other = (Grupo) obj;
		if (fase == null) {
			if (other.fase != null)
				return false;
		} else if (!fase.equals(other.fase))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero != other.numero)
			return false;
		if (rodadas == null) {
			if (other.rodadas != null)
				return false;
		} else if (!rodadas.equals(other.rodadas))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Grupo [nome=" + nome + ", fase=" + fase + ", numero=" + numero + "]";
	}

}
