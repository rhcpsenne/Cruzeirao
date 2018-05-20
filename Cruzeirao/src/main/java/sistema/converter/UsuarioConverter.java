package sistema.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import sistema.modelos.Usuario;

@FacesConverter("clienteConverter")
public class UsuarioConverter implements Converter{
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (Usuario)uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof Usuario) {
            Usuario entity = (Usuario) value;
            return String.valueOf(entity.getId());
            }
        
        return "";
    }
}
