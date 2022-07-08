package empresa;

public class Curso {
	private String nome;
	private double mensalidade;
	
	public Curso(String nome, double mensalidade) {
		setNome(nome);
		setMensalidade(mensalidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	void descrever() {
		System.out.println("Nome do Curso: " + nome);
		System.out.println("Mensalidade: " + mensalidade);
	}
}
