package negocio;

public class Livro {
	
	// propriedades da classe
	
	private String titulo="";
	private double ISBN=0;
	private Autor objAutor=null;
	private int ano=0;
	
	// método construtor da classe
	
	public Livro() {
		super();
	}
	public Livro(String titulo, double iSBN, Autor objAutor, int ano) {
		super();
		this.titulo = titulo;
		ISBN = iSBN;
		this.objAutor = objAutor;
		this.ano = ano;
		
		// método get/set da classe
	}
	public String getTitulo() {
		return titulo;
	}
	public void seTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getISBN() {
		return ISBN;
	}
	public void setISBN(double iSBN) {
		ISBN = iSBN;
	}
	public Autor getObjAutor() {
		return objAutor;
	}
	public void setObjAutor(Autor objAutor) {
		this.objAutor = objAutor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	
}
