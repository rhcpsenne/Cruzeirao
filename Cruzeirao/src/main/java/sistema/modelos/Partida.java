package sistema.modelos;

import java.util.Date;

public class Partida {
	private int numero;
	private Inscricao equipeMandante;
	private Inscricao equipeVisitante;
	private Date data;
	private Local local;
	private Partida proxPartida;
	//private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	//private Grupo grupo;
	private String relatoJuiz;
	public Partida() {
		super();
	}
	public Partida(int numero, Inscricao equipeMandante, Inscricao equipeVisitante, Date data, Local local,
			Partida proxPartida, String relatoJuiz) {
		super();
		this.numero = numero;
		this.equipeMandante = equipeMandante;
		this.equipeVisitante = equipeVisitante;
		this.data = data;
		this.local = local;
		this.proxPartida = proxPartida;
		this.relatoJuiz = relatoJuiz;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Inscricao getEquipeMandante() {
		return equipeMandante;
	}
	public void setEquipeMandante(Inscricao equipeMandante) {
		this.equipeMandante = equipeMandante;
	}
	public Inscricao getEquipeVisitante() {
		return equipeVisitante;
	}
	public void setEquipeVisitante(Inscricao equipeVisitante) {
		this.equipeVisitante = equipeVisitante;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public Partida getProxPartida() {
		return proxPartida;
	}
	public void setProxPartida(Partida proxPartida) {
		this.proxPartida = proxPartida;
	}
	public String getRelatoJuiz() {
		return relatoJuiz;
	}
	public void setRelatoJuiz(String relatoJuiz) {
		this.relatoJuiz = relatoJuiz;
	}
	
	
}
