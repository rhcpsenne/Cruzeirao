package sistema.modelos;

public class Local {
	private String endereco;
	
	
	public Local(String endereco) {
		super();
		this.endereco = endereco;
	}

	public Local() {
		super();
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
