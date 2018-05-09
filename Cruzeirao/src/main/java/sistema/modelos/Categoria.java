package sistema.modelos;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import enumerator.Sexo;

@Entity
public class Categoria {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cat_id;
	
	private String nome;
	private int apartirDe;
	@OneToMany(mappedBy="categoria", cascade=CascadeType.ALL)
	private ArrayList<Inscricao> inscricoes = new ArrayList<Inscricao>();
	@ManyToOne
	private Campeonato campeonato;
	@OneToMany(mappedBy="categoria", cascade=CascadeType.ALL)
	private ArrayList<Fase> fases = new ArrayList<Fase>();
	private int minJogadores;
	private int maxJogadores;
	private Sexo sexo;
	private int attribute74;
	//Gets E Sets & ToString
	public Categoria() {
		super();
	}
	public Categoria(int cat_id, String nome, int apartirDe, ArrayList<Inscricao> inscricoes, Campeonato campeonato,
			ArrayList<Fase> fases, int minJogadores, int maxJogadores, Sexo sexo, int attribute74) {
		super();
		this.cat_id = cat_id;
		this.nome = nome;
		this.apartirDe = apartirDe;
		this.inscricoes = inscricoes;
		this.campeonato = campeonato;
		this.fases = fases;
		this.minJogadores = minJogadores;
		this.maxJogadores = maxJogadores;
		this.sexo = sexo;
		this.attribute74 = attribute74;
	}
	
	public int getId() {
		return cat_id;
	}
	public void setId(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getApartirDe() {
		return apartirDe;
	}
	public void setApartirDe(int apartirDe) {
		this.apartirDe = apartirDe;
	}
	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(ArrayList<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public ArrayList<Fase> getFases() {
		return fases;
	}
	public void setFases(ArrayList<Fase> fases) {
		this.fases = fases;
	}
	public int getMinJogadores() {
		return minJogadores;
	}
	public void setMinJogadores(int minJogadores) {
		this.minJogadores = minJogadores;
	}
	public int getMaxJogadores() {
		return maxJogadores;
	}
	public void setMaxJogadores(int maxJogadores) {
		this.maxJogadores = maxJogadores;
	}
	public int getAttribute74() {
		return attribute74;
	}
	public void setAttribute74(int attribute74) {
		this.attribute74 = attribute74;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Categoria [cat_id=" + cat_id + ", nome=" + nome + ", apartirDe=" + apartirDe + ", inscricoes="
				+ inscricoes + ", campeonato=" + campeonato + ", fases=" + fases + ", minJogadores=" + minJogadores
				+ ", maxJogadores=" + maxJogadores + ", sexo=" + sexo + ", attribute74=" + attribute74 + "]";
	}
	
}