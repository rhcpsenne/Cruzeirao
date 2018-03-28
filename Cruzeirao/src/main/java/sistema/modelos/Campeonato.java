package sistema.modelos;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Campeonato {
	private String nome;
	private ArrayList<Local> locais = new ArrayList<Local>();
	private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private Date dataInicioInscricao;
	private Date dataFimInscricao;
	private Date dataInicioCampeonato;
	private Date dataFimCampeonato;
	private double valorTaxa;
	
	public Campeonato(String nome, ArrayList<Local> locais, Date dataInicioInscricao, Date dataFimInscricao,
			Date dataInicioCampeonato, Date dataFimCampeonato, double valorTaxa) {
		super();
		this.nome = nome;
		this.locais = locais;
		this.dataInicioInscricao = dataInicioInscricao;
		this.dataFimInscricao = dataFimInscricao;
		this.dataInicioCampeonato = dataInicioCampeonato;
		this.dataFimCampeonato = dataFimCampeonato;
		this.valorTaxa = valorTaxa;
	}
	public Campeonato() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Local> getLocais() {
		return locais;
	}
	public void setLocais(ArrayList<Local> locais) {
		this.locais = locais;
	}
	public ArrayList<Juiz> getJuizes() {
		return juizes;
	}
	public void setJuizes(ArrayList<Juiz> juizes) {
		this.juizes = juizes;
	}
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}
	public Date getDataInicioInscricao() {
		return dataInicioInscricao;
	}
	public void setDataInicioInscricao(Date dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}
	public Date getDataFimInscricao() {
		return dataFimInscricao;
	}
	public void setDataFimInscricao(Date dataFimInscricao) {
		this.dataFimInscricao = dataFimInscricao;
	}
	public Date getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}
	public void setDataInicioCampeonato(Date dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}
	public Date getDataFimCampeonato() {
		return dataFimCampeonato;
	}
	public void setDataFimCampeonato(Date dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}
	public double getValorTaxa() {
		return valorTaxa;
	}
	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
	@Override
	public String toString() {
		return "Campeonato [nome=" + nome + ", dataInicioInscricao=" + dataInicioInscricao + ", dataFimInscricao="
				+ dataFimInscricao + ", dataInicioCampeonato=" + dataInicioCampeonato + ", dataFimCampeonato="
				+ dataFimCampeonato + ", valorTaxa=" + valorTaxa + "]";
	}
}
