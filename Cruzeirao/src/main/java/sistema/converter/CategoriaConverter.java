package sistema.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import sistema.modelos.*;
import sistema.beans.CategoriaMB;

@FacesConverter("categoriaConverter")
public class CategoriaConverter implements Converter{
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if(value != null && value.trim().length() > 0) {
			for(Categoria cat : CategoriaMB.categorias) {
				if(cat.getNome().equals(value)) {
					return cat;
				}
			}		
		}
    return null;
}

	public String getAsString(FacesContext fc, UIComponent uic, Object object) {
		Categoria cat = (Categoria)object;
		if (cat != null) {
			if (cat instanceof Categoria)
				return cat.getNome();
		}

		return null;
	}
}

