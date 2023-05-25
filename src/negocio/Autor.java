package negocio;

public class Autor {
	
	//propriedade da classe
	
	private String nome="";

	
	// metodo construtor da classe
	
	public Autor() {
		super();
	}

	public Autor(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
