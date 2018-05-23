package sistema.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import sistema.modelos.*;
import sistema.beans.GrupoMB;

@FacesConverter("grupoConverter")
public class GrupoConverter implements Converter{
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if(value != null && value.trim().length() > 0) {
			for(Grupo grp : GrupoMB.grupos) {
				if(grp.getNome().equals(value)) {
					return grp;
				}
			}		
		}
    return null;
}

	public String getAsString(FacesContext fc, UIComponent uic, Object object) {
		Grupo grp = (Grupo)object;
		if (grp != null) {
			if (grp instanceof Grupo)
				return grp.getNome();
		}

		return null;
	}
}

