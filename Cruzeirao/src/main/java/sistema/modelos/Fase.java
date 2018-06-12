package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import enumerator.Formato;

@Entity
public class Fase implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date dataInicio;
	private Date dataFim;
	private Formato formato;
	@ManyToOne
	private Categoria categoria;
	@OneToMany(mappedBy="fase", cascade=CascadeType.ALL)
	private ArrayList<Grupo> grupos = new ArrayList<Grupo>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int fase_id;
	//Gets E Sets & ToString
	public Fase() {
		super();
	}
	public Fase(Date dataInicio, Date dataFim, Formato formato, Categoria categoria, ArrayList<Grupo> grupos, int fase_id) {
		super();
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.formato = formato;
		this.categoria = categoria;
		this.grupos = grupos;
		this.fase_id = fase_id;
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
	public int getId() {
		return fase_id;
	}
	public void setId(int fase_id) {
		this.fase_id = fase_id;
	}
	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((dataFim == null) ? 0 : dataFim.hashCode());
		result = prime * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
		result = prime * result + fase_id;
		result = prime * result + ((formato == null) ? 0 : formato.hashCode());
		result = prime * result + ((grupos == null) ? 0 : grupos.hashCode());
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
		Fase other = (Fase) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (dataFim == null) {
			if (other.dataFim != null)
				return false;
		} else if (!dataFim.equals(other.dataFim))
			return false;
		if (dataInicio == null) {
			if (other.dataInicio != null)
				return false;
		} else if (!dataInicio.equals(other.dataInicio))
			return false;
		if (fase_id != other.fase_id)
			return false;
		if (formato != other.formato)
			return false;
		if (grupos == null) {
			if (other.grupos != null)
				return false;
		} else if (!grupos.equals(other.grupos))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Fase [dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", categoria=" + categoria + ", grupos="
				+ grupos + ", numero=" + fase_id + "]";
	}
}
