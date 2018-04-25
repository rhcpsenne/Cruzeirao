package sistema.modelos;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private Date dataFundacao;
	private String cidade;
	private ArrayList<Usuario> diretores = new ArrayList<Usuario>();
	private ArrayList<Usuario> jogadores = new ArrayList<Usuario>();
	
	public Equipe() {
		super();
	}

	public Equipe(int id, String nome, Date dataFundacao, String cidade, ArrayList<Usuario> diretores) {
		super();
		this.id = id;
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
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
