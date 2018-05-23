package sistema.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import sistema.modelos.Inscricao;

//@FacesConverter(value = "classeConverter")    
//@FacesConverter(forClass = Classe.class)
public class InscricaoConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (Inscricao)uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof Inscricao) {
            Inscricao entity = (Inscricao) value;
            return String.valueOf(entity.getNumero());
            }
        
        return "";
    }
}
