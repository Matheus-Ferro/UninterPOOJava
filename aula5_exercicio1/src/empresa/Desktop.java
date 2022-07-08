package empresa;

public class Desktop extends Computador{
	double acessorios;
	
	public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
		super(gbMemoria, numProcessadores);
		this.acessorios = acessorios;
	}

	@Override
	double calculaValor() {
		return (gbMemoria * 200) + (numProcessadores * 400) + acessorios;
	}
}
