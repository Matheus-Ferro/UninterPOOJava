package empresa;

public class Principal {

	public static void main(String[] args) {
		
//		Para fazer referência a um valor do enum é usado o nome do enum seguido da opção, como no exemplo abaixo.
		Roupa r1 = new Roupa("Camisa", 3, Estacao.OUTONO);
		r1.msg();
	}

}
