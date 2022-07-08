package empresa;

public class Assalariado extends Funcionario {
	private float salario;

	public Assalariado(String nome, float salario) {
		super(nome);
		this.salario = salario;
	}
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public float pagamento() {
		return salario;
	}
}
