package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Inscricao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long numero;
	private boolean pagamento;
	private boolean validade;
	private ArrayList<Inscrito> inscritos = new ArrayList<Inscrito>();
	@ManyToOne
	private Categoria categoria;
	private ArrayList<Partida> partidas = new ArrayList<Partida>();
	@ManyToOne
	private Equipe equipe;

	public Inscricao() {
		super();
	}
	
	
	public Inscricao(long numero, boolean pagamento, boolean validade, ArrayList<Inscrito> inscritos,
			Categoria categoria, ArrayList<Partida> partidas, Equipe equipe) {
		super();
		this.numero = numero;
		this.pagamento = pagamento;
		this.validade = validade;
		this.inscritos = inscritos;
		this.categoria = categoria;
		this.partidas = partidas;
		this.equipe = equipe;
	}


	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public boolean isPagamento() {
		return pagamento;
	}
	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}
	public boolean isValidade() {
		return validade;
	}
	public void setValidade(boolean validade) {
		this.validade = validade;
	}
	public ArrayList<Inscrito> getInscritos() {
		return inscritos;
	}
	public void setInscritos(ArrayList<Inscrito> inscritos) {
		this.inscritos = inscritos;
	}
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((equipe == null) ? 0 : equipe.hashCode());
		result = prime * result + ((inscritos == null) ? 0 : inscritos.hashCode());
		result = prime * result + (int) (numero ^ (numero >>> 32));
		result = prime * result + (pagamento ? 1231 : 1237);
		result = prime * result + ((partidas == null) ? 0 : partidas.hashCode());
		result = prime * result + (validade ? 1231 : 1237);
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
		Inscricao other = (Inscricao) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (equipe == null) {
			if (other.equipe != null)
				return false;
		} else if (!equipe.equals(other.equipe))
			return false;
		if (inscritos == null) {
			if (other.inscritos != null)
				return false;
		} else if (!inscritos.equals(other.inscritos))
			return false;
		if (numero != other.numero)
			return false;
		if (pagamento != other.pagamento)
			return false;
		if (partidas == null) {
			if (other.partidas != null)
				return false;
		} else if (!partidas.equals(other.partidas))
			return false;
		if (validade != other.validade)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Inscricao [numero=" + numero + ", pagamento=" + pagamento + ", validade=" + validade + ", inscritos="
				+ inscritos + ", categoria=" + categoria + ", partidas=" + partidas + ", equipe=" + equipe + "]";
	}
	
	
}
