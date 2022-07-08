package empresa;

public class Pricipal {

	public static void main(String[] args) {
		
//		l1 é uma instancia de Livro
		Livro l1 = new Livro("A Revolta de Atras", "Ayn Rand");
		l1.imposto();
		
//		l2 é uma instancia de Livro e LivroDigital, por LivroDigital ser uma classe filha
//		de livro.
		LivroDigitalYes l2 = new LivroDigitalYes("A Revolta de Atras", "Ayn Rand");
		l2.imposto();
	}

}
