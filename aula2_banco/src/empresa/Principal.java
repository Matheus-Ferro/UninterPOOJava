package empresa;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(3602118, "Matheus Ferro", 22000, 1000);
		c1.info();
		
		if(!c1.sacar(1000)) {
			System.out.println("Problema ao sacar, verifique seu limite/saldo.");
		}
		
		if(!c1.depositar(4000)) {
			System.out.println("Problema ao depositar, verifique se o valor é válido.");
		}
		
		c1.info();
		
		Conta c2 = new Conta(1593578, "Giovanna", 10000, 500);
		
		if(!c1.transferir(c2, 5000)) {
			System.out.println("Problema ao transferir, verifique se o valor é válido.");
		}
		
		c1.info();
		c2.info();
	}

}
