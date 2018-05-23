package sistema.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import sistema.modelos.*;
import sistema.beans.EquipeMB;

@FacesConverter("equipeConverter")
public class EquipeConverter implements Converter{
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if(value != null && value.trim().length() > 0) {
			for(Equipe eq : EquipeMB.equipes) {
				if(eq.getNome().equals(value)) {
					return eq;
				}
			}		
		}
    return null;
}

	public String getAsString(FacesContext fc, UIComponent uic, Object object) {
		Equipe eq = (Equipe)object;
		if (eq != null) {
			if (eq instanceof Equipe)
				return eq.getNome();
		}

		return null;
	}
}

