package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import negocio.Livro;

public class LivroDAO {

	// PROPRIEDADE DA CLASSE

	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	private BancoDeDados objBanco = new BancoDeDados();
	private int proximoId = 0;

	// METODOS DA CLASSE

	public LivroDAO() throws Exception {
		super();

		objBanco.conectar();

		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT MAX(LIV_ID FROM LIV_LIVRO");
		objCursor = objExecucao.executeQuery();
		while (objCursor.next()) {
			proximoId = objCursor.getInt(1);
		}

		proximoId++;

		objBanco.desconectar();
	}

	public void persistir(Livro objLivro) throws Exception {
		objBanco.conectar();

		objExecucao = objBanco.getObjConexao().prepareStatement(
				"INSERT INTO LIV_LIVRO+" + "(LIV_ID, LIV_TITULO, LIV_IDAUTOR)" + "VALEUS" + "(?,?,?)");
		
		objExecucao.setInt(1, proximoId);
		objExecucao.setString(2, objLivro.getTitulo());
		objExecucao.setInt(3, objLivro.getObjAutor().getId());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}

}
