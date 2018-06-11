package enumconverter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import enumerator.Sexo;

@Converter(autoApply = true)
public class SexoConverter implements AttributeConverter<Sexo, String>{
	
	@Override
	public String convertToDatabaseColumn(Sexo sexo) 
	{
		switch (sexo) 
		{
			case MASCULINO: 		
				return "M"; 
			case FEMININO:
				return "F";
			default: throw new IllegalArgumentException("Unknown" + sexo);
		}
	}

	@Override
	public Sexo convertToEntityAttribute(String sexo) {

		switch (sexo)
		{
			case "M": 
				return Sexo.MASCULINO;
			case "F":
				return Sexo.FEMININO;
			default: throw new IllegalArgumentException("Unknown" + sexo);
		}
	}
}