package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Equipe implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int equipe_id;
	
	private String nome;
	private Date dataFundacao;
	private String cidade;
	@ManyToMany(mappedBy="equipes", cascade=CascadeType.ALL)
	private ArrayList<Usuario> diretores = new ArrayList<Usuario>();
	private ArrayList<Usuario> jogadores = new ArrayList<Usuario>();
	@OneToMany(mappedBy="equipe", cascade=CascadeType.ALL)
	private ArrayList<Inscricao> incricoes = new ArrayList<Inscricao>();
	
	public Equipe() {
		super();
	}

	public Equipe(int equipe_id, String nome, Date dataFundacao, String cidade, ArrayList<Usuario> diretores) {
		super();
		this.equipe_id = equipe_id;
		this.nome = nome;
		this.dataFundacao = dataFundacao;
		this.cidade = cidade;
		this.diretores = diretores;
	}
	
	
	
	public ArrayList<Usuario> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Usuario> jogadores) {
		this.jogadores = jogadores;
	}

	public int getId() {
		return equipe_id;
	}

	public void setId(int equipe_id) {
		this.equipe_id = equipe_id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public ArrayList<Usuario> getDiretores() {
		return diretores;
	}
	public void setDiretores(ArrayList<Usuario> diretores) {
		this.diretores = diretores;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((dataFundacao == null) ? 0 : dataFundacao.hashCode());
		result = prime * result + ((diretores == null) ? 0 : diretores.hashCode());
		result = prime * result + equipe_id;
		result = prime * result + ((incricoes == null) ? 0 : incricoes.hashCode());
		result = prime * result + ((jogadores == null) ? 0 : jogadores.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Equipe other = (Equipe) obj;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (dataFundacao == null) {
			if (other.dataFundacao != null)
				return false;
		} else if (!dataFundacao.equals(other.dataFundacao))
			return false;
		if (diretores == null) {
			if (other.diretores != null)
				return false;
		} else if (!diretores.equals(other.diretores))
			return false;
		if (equipe_id != other.equipe_id)
			return false;
		if (incricoes == null) {
			if (other.incricoes != null)
				return false;
		} else if (!incricoes.equals(other.incricoes))
			return false;
		if (jogadores == null) {
			if (other.jogadores != null)
				return false;
		} else if (!jogadores.equals(other.jogadores))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nome;
	}
}
