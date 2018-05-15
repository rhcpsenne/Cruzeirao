package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Categoria;
import sistema.service.CategoriaService;

@ManagedBean
@ViewScoped
public class CategoriaMB {
	private Categoria categoria = new Categoria();
	private List<Categoria> categorias;
	private CategoriaService service = new CategoriaService();
	
	public void onRowEdit(RowEditEvent event) {

		Categoria c = ((Categoria) event.getObject());
		service.alterar(c);
	}

	public void salvar() {
		categoria = service.salvar(categoria);

		if (categorias != null)
			categorias.add(categoria);

		categoria = new Categoria();

	}

//	public Categoria getCategoria() {
//		return categoria;
//	}
//
//	public void setCategoria(Categoria categoria) {
//		this.categoria = categoria;
//	}

	// Retorna a lista de alunos para a tabela
	public List<Categoria> getCategorias() {
		if (categorias == null)
			categorias = service.getCategorias();

		return categorias;
	}

	public void remover(Categoria categoria) {
		service.remover(categoria);
		categorias.remove(categoria);

	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}