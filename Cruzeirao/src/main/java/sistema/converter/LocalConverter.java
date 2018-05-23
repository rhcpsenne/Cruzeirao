package sistema.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import sistema.modelos.*;
import sistema.beans.LocalMB;

@FacesConverter("localConverter")
public class LocalConverter implements Converter{
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if(value != null && value.trim().length() > 0) {
			for(Local loc : LocalMB.locais) {
				if(loc.getNome().equals(value)) {
					return loc;
				}
			}		
		}
    return null;
}

	public String getAsString(FacesContext fc, UIComponent uic, Object object) {
		Local loc = (Local)object;
		if (loc != null) {
			if (loc instanceof Local)
				return loc.getNome();
		}

		return null;
	}
}
