package sistema.modelos;

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
import javax.persistence.OneToMany;

@Entity
public class Campeonato {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int campeonato_id;
	private String nome;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="campeonato_local", joinColumns={@JoinColumn(name="ID_Campeonato")}, inverseJoinColumns={@JoinColumn(name="ID_Local")})
	private ArrayList<Local> locais = new ArrayList<Local>();
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="campeonato_juiz", joinColumns={@JoinColumn(name="ID_Campeonato")}, inverseJoinColumns={@JoinColumn(name="ID_Juiz")})
	private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	@OneToMany(mappedBy="campeonato", cascade=CascadeType.ALL)
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private Date dataInicioInscricao;
	private Date dataFimInscricao;
	private Date dataInicioCampeonato;
	private Date dataFimCampeonato;
	private double valorTaxa;
	@ManyToOne
	private Usuario usuario;
	
	public Campeonato(int campeonato_id, String nome, ArrayList<Local> locais, Date dataInicioInscricao, Date dataFimInscricao,
			Date dataInicioCampeonato, Date dataFimCampeonato, double valorTaxa) {
		super();
		this.campeonato_id = campeonato_id;
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
	
	public int getId() {
		return campeonato_id;
	}
	public void setId(int campeonato_id) {
		this.campeonato_id = campeonato_id;
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
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "Campeonato [campeonato_id=" + campeonato_id + ", nome=" + nome + ", locais=" + locais + ", juizes=" + juizes + ", categorias="
				+ categorias + ", dataInicioInscricao=" + dataInicioInscricao + ", dataFimInscricao=" + dataFimInscricao
				+ ", dataInicioCampeonato=" + dataInicioCampeonato + ", dataFimCampeonato=" + dataFimCampeonato
				+ ", valorTaxa=" + valorTaxa + "]";
	}
	
}
