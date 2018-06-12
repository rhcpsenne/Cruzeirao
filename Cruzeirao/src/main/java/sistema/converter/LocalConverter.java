package sistema.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import sistema.modelos.Local;

//@FacesConverter(value = "classeConverter")    
//@FacesConverter(forClass = Classe.class)
public class LocalConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (Local)uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof Local) {
            Local entity = (Local) value;
            return String.valueOf(entity.getId());
            }
        
        return "";
    }
}

