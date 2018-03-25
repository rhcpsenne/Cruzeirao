package sistema.modelos;

import java.util.ArrayList;

public class Inscricao {
	private long numero;
	private boolean pagamento;
	private boolean validade;
	private ArrayList<Inscrito> inscritos = new ArrayList<Inscrito>();
	//private Categoria categoria;  --> GET E SET
	private ArrayList<Partida> partidas = new ArrayList<Partida>();
	private Equipe equipe;
	public Inscricao() {
		super();
	}
	public Inscricao(long numero, boolean pagamento, boolean validade, ArrayList<Inscrito> inscritos,
			ArrayList<Partida> partidas, Equipe equipe) {
		super();
		this.numero = numero;
		this.pagamento = pagamento;
		this.validade = validade;
		this.inscritos = inscritos;
		this.partidas = partidas;
		this.equipe = equipe;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public boolean isPagamento() {
		return pagamento;
	}
	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}
	public boolean isValidade() {
		return validade;
	}
	public void setValidade(boolean validade) {
		this.validade = validade;
	}
	public ArrayList<Inscrito> getInscritos() {
		return inscritos;
	}
	public void setInscritos(ArrayList<Inscrito> inscritos) {
		this.inscritos = inscritos;
	}
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	@Override
	public String toString() {
		return "Inscricao [numero=" + numero + ", pagamento=" + pagamento + ", validade=" + validade + ", inscritos="
				+ inscritos + ", partidas=" + partidas + ", equipe" + equipe + "]";
	}
}
