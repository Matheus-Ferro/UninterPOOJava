package empresa;

public class Professor {
	String nome;
	String formacao;
	int cadastro;
	
	void info() {
		System.out.println("Professor: "+nome);
		System.out.println("Formação: "+formacao);
		System.out.println("Cadastro: "+cadastro);
		System.out.println("");
	}
}
