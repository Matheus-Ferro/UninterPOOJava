package empresa;

import java.util.ArrayList;

public class Turma {
	String nome;
	Professor prof;
	ArrayList<Aluno> alunos;
	
	void info(){
		System.out.println("Turma: " + nome);
		prof.info();
		for(Aluno a: alunos) {
			a.info();
		}
	}
	
}