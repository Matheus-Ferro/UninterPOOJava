package empresa;

public class Comissionado extends Funcionario{
	private float comissao;
	private float vendas;
	
	public Comissionado(String nome, float comissao, float vendas) {
		super(nome);
		this.comissao = comissao;
		this.vendas = vendas;
	}

	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	public float getVendas() {
		return vendas;
	}
	public void setVendas(float vendas) {
		this.vendas = vendas;
	}
	
	@Override
	public float pagamento() {
		return vendas * comissao;
	}
	
}
