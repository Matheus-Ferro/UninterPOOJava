package empresa;

public class Livro {
	public String autor;
	public float custoProducao;
	public float precoVenda;
	public String titulo;
	public int paginas;
	
	Livro(String autor, String titulo){
		
	}
	
	public float lucro() {
		return precoVenda - custoProducao;
	}
	
	public void imprimirTitulo() {
		System.out.println("Titulo: " + titulo);
	}
	
	public float imposto() {
		return 0.2f * lucro();
	}
	
}
