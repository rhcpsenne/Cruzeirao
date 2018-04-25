package sistema.modelos;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import enumerator.Sexo;
import enumerator.Tipo;

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_usuario;
	
	private String email;
	private String nome;
	private Date dataNascimento;
	private ArrayList<Equipe> equipes = new ArrayList<Equipe>();
	private ArrayList<Usuario> diretores = new ArrayList<Usuario>();
	private ArrayList<Inscricao> inscricoes = new ArrayList<Inscricao>();
	private ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();
	private Tipo tipo; 
	private String telefoneFixo;
	private String telefoneMovel;
	private String endereco;
	private String rg;
	private String cpf;
	private String cref;
	private Sexo sexo; 
	private String foto;
	public Usuario() {
		super();
	}
	public Usuario(int id_usuario, String email, String nome, Date dataNascimento, String telefoneFixo, String telefoneMovel,
			String endereco, String rg, String cpf, String cref, String foto, Sexo sexo, Tipo tipo) {
		super();
		this.id_usuario = id_usuario;
		this.email = email;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefoneFixo = telefoneFixo;
		this.telefoneMovel = telefoneMovel;
		this.endereco = endereco;
		this.rg = rg;
		this.cpf = cpf;
		this.cref = cref;
		this.foto = foto;
		this.sexo = sexo;
		this.tipo = tipo;
	}
	
	
	
	public ArrayList<Usuario> getDiretores() {
		return diretores;
	}
	public void setDiretores(ArrayList<Usuario> diretores) {
		this.diretores = diretores;
	}
	public int getId() {
		return id_usuario;
	}
	public void setId(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public ArrayList<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(ArrayList<Equipe> equipes) {
		this.equipes = equipes;
	}
	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(ArrayList<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public ArrayList<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getTelefoneMovel() {
		return telefoneMovel;
	}
	public void setTelefoneMovel(String telefoneMovel) {
		this.telefoneMovel = telefoneMovel;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCref() {
		return cref;
	}
	public void setCref(String cref) {
		this.cref = cref;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", email=" + email + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", equipes=" + equipes + ", inscricoes=" + inscricoes + ", campeonatos=" + campeonatos + ", tipo="
				+ tipo + ", telefoneFixo=" + telefoneFixo + ", telefoneMovel=" + telefoneMovel + ", endereco="
				+ endereco + ", rg=" + rg + ", cpf=" + cpf + ", cref=" + cref + ", sexo=" + sexo + ", foto=" + foto
				+ "]";
	}
	
	
	
}
