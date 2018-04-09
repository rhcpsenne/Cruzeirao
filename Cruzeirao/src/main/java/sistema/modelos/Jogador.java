package sistema.modelos;

import java.util.ArrayList;

public class Jogador extends Usuario {

	private ArrayList<Usuario> diretores = new ArrayList<Usuario>();
	private Usuario usuario;

	public ArrayList<Usuario> getDiretores() {
		return diretores;
	}

	public void setDiretores(ArrayList<Usuario> diretores) {
		this.diretores = diretores;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
