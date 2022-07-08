package empresa;

public class Aluno {
	Aluno(String nome, String curso, double n1, double n2, double n3){
		info(nome, curso, n1, n2, n3);
	}
	void info(String nome, String curso, double n1, double n2, double n3) {
		System.out.println("Nome: "+ nome);
		System.out.println("Curso: "+ curso);
		Avaliacao ava = new Avaliacao(n1,n2,n3);
	}
}
