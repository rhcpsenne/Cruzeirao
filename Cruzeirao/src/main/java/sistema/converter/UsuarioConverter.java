package sistema.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import sistema.modelos.*;
import sistema.beans.UsuarioMB;

@FacesConverter("usuarioConverter")
public class UsuarioConverter implements Converter{
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if(value != null && value.trim().length() > 0) {
			for(Usuario usr : UsuarioMB.usuarios) {
				if(usr.getNome().equals(value)) {
					return usr;
				}
			}		
		}
    return null;
}

	public String getAsString(FacesContext fc, UIComponent uic, Object object) {
		Usuario usr = (Usuario)object;
		if (usr != null) {
			if (usr instanceof Usuario)
				return usr.getNome();
		}

		return null;
	}
}
