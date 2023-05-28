package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.LinkedList;

import negocio.Autor;

public class AutorDAO {

	// PROPRIEDADE DA CLASSE

	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	private BancoDeDados objBanco = new BancoDeDados();

	// METODOS DA CLASSE

	public Collection<Autor> getTodos() throws Exception {
		LinkedList<Autor> colecao = new LinkedList<Autor>();

		objBanco.conectar();

		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT *FROM AUT_AUTOR");
		objCursor = objExecucao.executeQuery();
		while (objCursor.next()) {
			colecao.add(new Autor(objCursor.getInt("AUT_ID"),
					objCursor.getString("AUT_NOME")));
		}

		objBanco.desconectar();
		return colecao;
	}
}
