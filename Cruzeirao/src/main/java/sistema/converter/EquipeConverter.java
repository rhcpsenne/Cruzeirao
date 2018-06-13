package sistema.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import sistema.modelos.Equipe;

//@FacesConverter(value = "classeConverter")    
@FacesConverter(forClass = Equipe.class)
public class EquipeConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (Equipe)uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof Equipe) {
            Equipe entity = (Equipe) value;
            return String.valueOf(entity.getId());
            }
        
        return "";
    }
}

