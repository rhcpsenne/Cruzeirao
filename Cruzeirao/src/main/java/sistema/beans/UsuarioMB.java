package sistema.beans;

import sistema.modelos.Usuario;
import sistema.service.UsuarioService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import enumerator.Sexo;
import enumerator.Tipo;

@ManagedBean
@ViewScoped
public class UsuarioMB {
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	private UsuarioService service = new UsuarioService();
	
	
	public Sexo[] getSexo(){
		return Sexo.values();
	}
	
	public Tipo[] getTipo() {
		return Tipo.values();
	}


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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
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
