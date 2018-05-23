package sistema.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import sistema.modelos.*;
import sistema.beans.CampeonatoMB;

@FacesConverter("campeonatoConverter")
public class CampeonatoConverter implements Converter{
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if(value != null && value.trim().length() > 0) {
			for(Campeonato camp : CampeonatoMB.campeonatos) {
				if(camp.getNome().equals(value)) {
					return camp;
				}
			}		
		}
    return null;
}

	public String getAsString(FacesContext fc, UIComponent uic, Object object) {
		Campeonato camp = (Campeonato)object;
		if (camp != null) {
			if (camp instanceof Campeonato)
				return camp.getNome();
		}

		return null;
	}
}
