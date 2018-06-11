package enumconverter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import enumerator.Formato;

@Converter(autoApply = true)
public class FormatoConverter implements AttributeConverter<Formato, String>{
	
	@Override
	public String convertToDatabaseColumn(Formato formato) 
	{
		switch (formato) 
		{
			case Eliminatórias: 		
				return "E"; 
			default: throw new IllegalArgumentException("Unknown" + formato);
		}
	}

	@Override
	public Formato convertToEntityAttribute(String formato) {

		switch (formato)
		{
			case "E": return Formato.Eliminatórias;
			default: throw new IllegalArgumentException("Unknown" + formato);
		}
	}
}
