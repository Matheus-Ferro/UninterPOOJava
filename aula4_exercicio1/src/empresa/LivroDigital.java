package empresa;

public class LivroDigital extends Livro {
	private int download;
	private double tamanho;
	
	public LivroDigital() {}
	public LivroDigital(String titulo, Autor autor, String genero, int edicao, int download, double tamanho) {
		super(titulo, autor, genero, edicao);
		this.download = download;
		this.tamanho = tamanho;
	}

	public int getDownload() {
		return download;
	}
	public void setDownload(int download) {
		this.download = download;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
//	Note que abaixo usei uma anotation, essa anotation indica que o método abaixo sobrescreve o metodo de mesmo
//	nome da classe mãe, a anotation serve para garantir que o método está fazendo o que foi proposto (sobrescrever)
//	e caso o nome esteja diferente do da classe mãe ele vai informar com um erro.
	@Override
	public void info() {
		super.info();
		System.out.println("---Detalhes Digitais---");
		System.out.println("Quantidade de Downloads: " + download);
		System.out.println("Tamanho (mb): " + tamanho);
	}
	
}
