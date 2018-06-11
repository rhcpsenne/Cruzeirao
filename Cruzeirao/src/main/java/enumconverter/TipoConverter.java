package enumconverter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import enumerator.Tipo;

@Converter(autoApply = true)
public class TipoConverter implements AttributeConverter<Tipo, String>{
	
	@Override
	public String convertToDatabaseColumn(Tipo tipo) 
	{
		switch (tipo) 
		{
			case ADM: 		
				return "ADM"; 
			case DIRETOR:
				return "Dir";
			case JUIZ:
				return "Juíz";
			case JOGADOR:
				return "Jog";
			case ORGANIZADOR:
				return "Org";
			case TECNICO:
				return "Tec";
			case TORCEDOR:
				return "Tor";
			default: throw new IllegalArgumentException("Unknown" + tipo);
		}
	}

	@Override
	public Tipo convertToEntityAttribute(String tipo) {

		switch (tipo)
		{
			case "ADM": 
				return Tipo.ADM;
			case "Dir":
				return Tipo.DIRETOR;
			case "Juíz":
				return Tipo.JUIZ;
			case "Jog":
				return Tipo.JOGADOR;
			case "Org":
				return Tipo.ORGANIZADOR;
			case "Tec":
				return Tipo.TECNICO;
			case "Tor":
				return Tipo.TORCEDOR;
			default: throw new IllegalArgumentException("Unknown" + tipo);
		}
	}
}