package empresa;

public class Aluno {
//	Atributos desta classe
	public String nome;
	public String cpf;
	public int matricula;
	
//	Construtores: uma classe pode ter mais de um contrutor, nesse exemplo usamos um construtor vazio para
//	para as instâncias que atribuem os valores direto para os atributos da classe, e outro construtor com
//	parâmetros para as instâncias que atribuem os valores em forma de parâmetro.	
	
//	Construtor vazio: sem parâmetros
	public Aluno(){

	}
	
//	Construtor povoado com parâmetros
	public Aluno(String nome, String cpf, int matricula){
//		Os parâmetros do construtor se tornam métodos locais do construtor, portanto precisamos atribui-los
//		aos métodos da classe, para isso temos que utilizar o this.<atributo da classe>.
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
	}
	
//	void: significa que este método não retorna nada.
	void info() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Matrícula: " + matricula);
		System.out.println("");
	}
	
//-------------------------------------------------------------------------------------------------------------------------------
//	static atributo: o atributo se torna global, é acessada a mesma variável, mesma posição na memória, por todas as instâncias.
	static float milhasParaMetros(float milhas) {
		return milhas * 1600;
	}
	
//	static método: pode ser utilizado sem instanciar o objeto, só fazendo referência a ele.
//	final: significa que é uma constante, o valor não pode ser alterado.
	static final double PI = 3.1415;
	
}
