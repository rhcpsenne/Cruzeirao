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
	
	@Override
	public String toString() {
		return "Equipe [nome=" + nome + ", dataFundacao=" + dataFundacao + ", cidade=" + cidade + ", diretores="
				+ diretores + "]";
	}
}
