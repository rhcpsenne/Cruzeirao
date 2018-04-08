package sistema.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Local {
	@Id
	private int id;
	
	private String endereco;
	
	
	public Local(int id, String endereco) {
		super();
		this.id = id;
		this.endereco = endereco;
	}

	public Local() {
		super();
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
