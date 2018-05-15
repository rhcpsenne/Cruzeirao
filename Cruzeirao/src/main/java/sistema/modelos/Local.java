package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Local implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int local_id;
	@ManyToMany(mappedBy="locais", cascade=CascadeType.ALL)
	private ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();
	@OneToMany(mappedBy="local", cascade=CascadeType.ALL)
	private ArrayList<Partida> partidas = new ArrayList<Partida>();
	
	
	private String endereco;
	
	
	public Local(int local_id, String endereco) {
		super();
		this.local_id = local_id;
		this.endereco = endereco;
	}

	public Local() {
		super();
	}
	

	public int getId() {
		return local_id;
	}

	public void setId(int local_id) {
		this.local_id = local_id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Local [endereco=" + endereco + "]";
	}
}
