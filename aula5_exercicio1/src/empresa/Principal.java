package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Desktop compA = new Desktop(8, 4, 600);
		Notebook compB = new Notebook(8, 4, 15);
		
		ArrayList<Computador> listaComputadores = new ArrayList<Computador>();
		listaComputadores.add(compA);
		listaComputadores.add(compB);
		listaComputadores.add(new Desktop(16, 8, 1200));
		listaComputadores.add(new Desktop(16, 8, 18));

		double total = 0;
		for(Computador c : listaComputadores) {
			total += c.calculaValor();
		}
		
		System.out.printf("Total dos computadores: R$ %.2f \n", total);
	}

}
