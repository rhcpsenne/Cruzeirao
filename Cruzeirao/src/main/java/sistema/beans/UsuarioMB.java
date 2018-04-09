package sistema.beans;

import sistema.modelos.Usuario;
import sistema.service.UsuarioService;

import java.util.List;

import org.primefaces.event.RowEditEvent;

public class UsuarioMB {
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	private UsuarioService service = new UsuarioService();
	
	public void onRowEdit(RowEditEvent event) {

		Usuario u = ((Usuario) event.getObject());
		service.alterar(u);
	}

	public void salvar() {
		usuario = service.salvar(usuario);

		if (usuarios != null)
			usuarios.add(usuario);

		usuario = new Usuario();

	}

	public Usuario getAluno() {
		return usuario;
	}

	public void setAluno(Usuario usuario) {
		this.usuario = usuario;
	}

	// Retorna a lista de alunos para a tabela
	public List<Usuario> getUsuarios() {
		if (usuarios == null)
			usuarios = service.getUsuarios();

		return usuarios;
	}

	public void remover(Usuario usuario) {
		service.remover(usuario);
		usuarios.remove(usuario);

	}
	
}
