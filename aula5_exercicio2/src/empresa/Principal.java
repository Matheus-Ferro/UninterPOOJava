package empresa;

public class Principal {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Matheus", "061.205.021-14");
		f.imprimir();
		Carro c = new Carro("Hyundai", "Preto", 4);
		c.imprimir();
		Quadrado q = new Quadrado(8);		
		q.imprimir();
	}

}
