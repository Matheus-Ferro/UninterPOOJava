package empresa;

public class Horista extends Funcionario {
	private int totalHoras;
	private float valorHora;
	
	public Horista(String nome, int totalHoras, float valorHora) {
		super(nome);
		this.totalHoras = totalHoras;
		this.valorHora = valorHora;
	}
	
	public int getTotalHoras() {
		return totalHoras;
	}
	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	@Override
	public float pagamento() {
		return totalHoras * valorHora;
	}
	
}
