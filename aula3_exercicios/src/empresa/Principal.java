package empresa;

public class Principal {

	public static void main(String[] args) {
//		---------------------------------------------------------------------------------------------------
//		Exercícios 1 e 2
		Nota matheus = new Nota(5, 10, 8);
		matheus.resultado();
		
		System.out.println("");
//		---------------------------------------------------------------------------------------------------
//		Exercício 3
		Aluno a1 = new Aluno("Matheus Ferro", 3602118, 0.1, new Curso("Engenharia de Software", 1000));
		a1.descrever();
		
		System.out.println("");
//		---------------------------------------------------------------------------------------------------
//		Exercício 4
		Cofrinho cofri = new Cofrinho();
		cofri.add(new Moeda("Real", 1));
		cofri.add(new Moeda("Real", 0.5));
		cofri.add(new Moeda("Real", 0.25));
		cofri.add(new Moeda("Real", 0.10));
		cofri.add(new Moeda("Real", 0.05));
		cofri.add(new Moeda("Real", 1));
		cofri.add(new Moeda("Real", 0.10));
		cofri.info();
	}

}
