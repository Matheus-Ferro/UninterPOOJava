package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
//		ArrayList é a forma mais prática de se criar um array, mas também se pode criar da forma tradicional com:
//		int meuArray[] = {10,20,30,40,50,60};
		
		ArrayList<String> nomes = new ArrayList();
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quantidade de pessoas: ");
		int total = teclado.nextInt();
		
		for(int i = 0; i < total; i++) {
			System.out.print("Nome " + (i+1) + ": ");
			nomes.add(teclado.next());
		}

		System.out.println("Ordem de inserção: ");
//		Como o forEach do Javascript: Para cada n em nomes imprima n.
		for(String n : nomes) {
			System.out.println(n);
		}
		
		System.out.println("Ordem Inversa: ");
		for(int i = total - 1; i >= 0; i--) {
			System.out.println(nomes.get(i));
		}
		
		System.out.println("Ordem Inversa com Collections: ");
		Collections.reverse(nomes);
		System.out.println(nomes);
	}

}
