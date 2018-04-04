package sistema.modelos;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import enumerator.Formato;

@Entity
public class Fase {
	private Date dataInicio;
	private Date dataFim;
	private Formato formato;
	private Categoria categoria;
	private ArrayList<Grupo> grupos = new ArrayList<Grupo>();
	
	@Id
	private int numero;
	//Gets E Sets & ToString
	public Fase() {
		super();
	}
	public Fase(Date dataInicio, Date dataFim, Formato formato, Categoria categoria, ArrayList<Grupo> grupos, int numero) {
		super();
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.formato = formato;
		this.categoria = categoria;
		this.grupos = grupos;
		this.numero = numero;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}
	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	@Override
	public String toString() {
		return "Fase [dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", categoria=" + categoria + ", grupos="
				+ grupos + ", numero=" + numero + "]";
	}
}
