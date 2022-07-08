package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
//		Instanciando o objeto.
		Aluno a = new Aluno();
		Aluno b = new Aluno();
		
//		Atribuindo valores aos atributos.
		a.matricula = 3602118;
		a.nome = "Matheus Ferro";
		a.cpf = "061.205.021-14";
		a.info();
		
		b.matricula = 2707200;
		b.nome = "Giovanna";
		b.cpf = "270.720.580-36";
		b.info();
		
//----------------------------------------------------------------------
//		Orientação a Objetos
		Turma nova = new Turma();
		nova.nome = "3º C";
		
		nova.prof = new Professor();
		nova.prof.nome = "Matheus";
		nova.prof.formacao = "Engenharia de Software";
		nova.prof.cadastro = 2000;
		
		nova.alunos = new ArrayList<Aluno>();
		
//		Aluno criado com o construtor sem parâmetros, atribuindo os valores direto aos atributos da classe
		nova.alunos.add(new Aluno());
		nova.alunos.get(0).nome = "Fernanda";
		nova.alunos.get(0).cpf = "420.520.620-70";
		nova.alunos.get(0).matricula = 2010;
		
//		Aluno criado com os parâmetros do construtor.
		nova.alunos.add(new Aluno("Giovanna", "120.220.320-40", 2005));
		nova.info();
		
//----------------------------------------------------------------------	
//		Utilizando um método static sem instanciar o objeto.
		System.out.println(Aluno.milhasParaMetros(10));
	}
}

