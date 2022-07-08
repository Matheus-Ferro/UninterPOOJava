package empresa;

public class Quadrado implements Imprimivel {
	int medidaLado;
	
	public Quadrado(int medidaLado) {
		super();
		this.medidaLado = medidaLado;
	}

	@Override
	public void imprimir() {
		System.out.println("---Quadrado---");
		System.out.println("Area: " + (medidaLado * 4));
		System.out.println("-------------------------------------");
	}
	
}
