package negocio;

public abstract class Entidade {
	
	//PROPRIEDADE DA CLASSE
	
	private int id = 0;

	// METODOS CONTRUTORES DA CLASSE
	public Entidade() {
		super();
	}

	public Entidade(int id) {
		super();
		this.id = id;
	}

	// METODO GET/SET DA CLASSE 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	


}
