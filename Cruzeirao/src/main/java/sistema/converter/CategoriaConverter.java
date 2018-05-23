package sistema.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import sistema.modelos.Categoria;

//@FacesConverter(value = "classeConverter")    
//@FacesConverter(forClass = Classe.class)
public class CategoriaConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (Categoria)uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof Categoria) {
            Categoria entity = (Categoria) value;
            return String.valueOf(entity.getId());
            }
        
        return "";
    }
}

