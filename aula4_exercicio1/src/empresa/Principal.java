package empresa;

public class Principal {

	public static void main(String[] args) {
		LivroDigital ld = new LivroDigital("A Revolta de Atlas", new Autor("Ayn Rand", "example@example.com", "Russa"),
				"Romance", 8, 1674325, 45);
		ld.info();
	}

}
