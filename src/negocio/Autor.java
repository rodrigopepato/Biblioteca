package negocio;

import java.util.Collection;

import persistencia.AutorDAO;

public class Autor extends Entidade {
	
	//propriedade da classe
	
	private String nome="";

	
	// metodo construtor da classe
	
	public Autor() {
		super();
	}

	public Autor(int id, String nome) {
		super(id);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public static Collection<Autor> getTodos() throws Exception {
		return new AutorDAO().getTodos();
	}
	
}
