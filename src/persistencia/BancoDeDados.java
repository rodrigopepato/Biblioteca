package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {

	//PROPRIEDADE DA CLASSE 
	private Connection objConexao = null;
	
	//METODO GET/SET DA CLASSE 
	Connection getObjConexao() {
		return objConexao;
	}
	
	//METODO DA CLASSE
	
	void conectar() throws Exception {
		objConexao = DriverManager.getConnection ("jdbc:oracle:thin:@//localhost:1521/XE?user=hr&password=Pepauli2009");
	}
	
	void desconectar() throws Exception {
		objConexao.close();
	}
}
