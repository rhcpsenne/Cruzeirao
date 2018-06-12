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
import javax.persistence.OneToMany;

@Entity
public class Campeonato implements Serializable{
	private static final long serialVersionUID = 1L;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + campeonato_id;
		result = prime * result + ((categorias == null) ? 0 : categorias.hashCode());
		result = prime * result + ((dataFimCampeonato == null) ? 0 : dataFimCampeonato.hashCode());
		result = prime * result + ((dataFimInscricao == null) ? 0 : dataFimInscricao.hashCode());
		result = prime * result + ((dataInicioCampeonato == null) ? 0 : dataInicioCampeonato.hashCode());
		result = prime * result + ((dataInicioInscricao == null) ? 0 : dataInicioInscricao.hashCode());
		result = prime * result + ((juizes == null) ? 0 : juizes.hashCode());
		result = prime * result + ((locais == null) ? 0 : locais.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorTaxa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campeonato other = (Campeonato) obj;
		if (campeonato_id != other.campeonato_id)
			return false;
		if (categorias == null) {
			if (other.categorias != null)
				return false;
		} else if (!categorias.equals(other.categorias))
			return false;
		if (dataFimCampeonato == null) {
			if (other.dataFimCampeonato != null)
				return false;
		} else if (!dataFimCampeonato.equals(other.dataFimCampeonato))
			return false;
		if (dataFimInscricao == null) {
			if (other.dataFimInscricao != null)
				return false;
		} else if (!dataFimInscricao.equals(other.dataFimInscricao))
			return false;
		if (dataInicioCampeonato == null) {
			if (other.dataInicioCampeonato != null)
				return false;
		} else if (!dataInicioCampeonato.equals(other.dataInicioCampeonato))
			return false;
		if (dataInicioInscricao == null) {
			if (other.dataInicioInscricao != null)
				return false;
		} else if (!dataInicioInscricao.equals(other.dataInicioInscricao))
			return false;
		if (juizes == null) {
			if (other.juizes != null)
				return false;
		} else if (!juizes.equals(other.juizes))
			return false;
		if (locais == null) {
			if (other.locais != null)
				return false;
		} else if (!locais.equals(other.locais))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (Double.doubleToLongBits(valorTaxa) != Double.doubleToLongBits(other.valorTaxa))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Campeonato [campeonato_id=" + campeonato_id + ", nome=" + nome + ", locais=" + locais + ", juizes=" + juizes + ", categorias="
				+ categorias + ", dataInicioInscricao=" + dataInicioInscricao + ", dataFimInscricao=" + dataFimInscricao
				+ ", dataInicioCampeonato=" + dataInicioCampeonato + ", dataFimCampeonato=" + dataFimCampeonato
				+ ", valorTaxa=" + valorTaxa + "]";
	}
	
}