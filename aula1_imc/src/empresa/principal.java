package empresa;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		System.out.print("Peso (kg): ");
		Scanner teclado = new Scanner(System.in);
		float peso = teclado.nextFloat();
		
		System.out.print("Altura (m): ");
		float altura = teclado.nextFloat();
		
//		Também poderia ser feito (float imc = peso / Math.pow(altura, 2);	
		float imc = peso / (altura * altura);
		
//		O printf serve para exibir um número especificando a quantidade de casas decimais.
		System.out.printf("IMC: %.2f", imc);
	}

}
