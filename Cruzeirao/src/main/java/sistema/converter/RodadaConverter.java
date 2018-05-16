package sistema.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import sistema.modelos.Rodada;

//@FacesConverter(value = "classeConverter")    
//@FacesConverter(forClass = Classe.class)
public class RodadaConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (Rodada)uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof Rodada) {
            Rodada entity = (Rodada) value;
            return String.valueOf(entity.getNumero());
            }
        
        return "";
    }
}
