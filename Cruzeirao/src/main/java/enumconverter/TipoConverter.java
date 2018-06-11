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
			case Diretor:
				return "Dir";
			case Juiz:
				return "Juíz";
			case Jogador:
				return "Jog";
			case Medico:
				return "Med";
			case Organizador:
				return "Org";
			case Tecnico:
				return "Tec";
			case Torcedor:
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
				return Tipo.Diretor;
			case "Juíz":
				return Tipo.Juiz;
			case "Jog":
				return Tipo.Jogador;
			case "Med":
				return Tipo.Medico;
			case "Org":
				return Tipo.Organizador;
			case "Tec":
				return Tipo.Tecnico;
			case "Tor":
				return Tipo.Torcedor;
			default: throw new IllegalArgumentException("Unknown" + tipo);
		}
	}
}