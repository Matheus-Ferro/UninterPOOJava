package empresa;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Palpite: ");
		int palpite = teclado.nextInt();
		
		String msg;
		while(palpite != 10000) {
			//Operador Ternário
			msg = palpite<10000?"Um pouco mais...":"Um pouco menos...";
			System.out.println(msg);
			System.out.print("Palpite: ");
			palpite = teclado.nextInt();
		}
		
		System.out.println("Correto!");
	}

}
