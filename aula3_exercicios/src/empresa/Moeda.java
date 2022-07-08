package empresa;

public class Moeda {
	private String nome;
	private double valor;
	
	public Moeda(String nome, double valor) {
		setValor(valor);
		setNome(nome);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if(valor == 0.05 || valor == 0.10 || valor == 0.25 || valor == 0.50 || valor == 1) {
			this.valor = valor;
		}else {
			System.out.println("Moeda Inválida");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
