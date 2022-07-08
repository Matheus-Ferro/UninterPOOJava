package empresa;

public class Principal {

	public static void main(String[] args) {
		Animal a1 = new Gato();
		Gato g1 = new Gato();
		a1.emitirSom();
		a1.dormir();
		g1.emitirSom();
		g1.dormir();
	}

}
