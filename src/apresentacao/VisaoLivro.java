package apresentacao;

import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Autor;

public class VisaoLivro extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel objPainel = new JPanel();

	private JLabel lblTitulo = new JLabel("Titulo");
	private JTextField txtTitulo = new JTextField();

	private JLabel lblAutor = new JLabel("Autor");
	private JComboBox<String> cboAutor = new JComboBox<String>();
	private Collection<Autor> colecao = null;

	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");

	// MÉTODO PRINCIPAL DE EXECUÇÃO DA CLASSE

	public static void main(String[] args) {
		new VisaoLivro().setVisible(true);
	}

	public VisaoLivro() {

		// CONFIGURAÇÃO DA JANELA
		setTitle("Cadastro de livros");
		setSize(450, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// CONFIGURAÇÃO DO PAINEL

		objPainel.setLayout(null);
		setContentPane(objPainel);

		// CONFIGURAÇÃO TÍTULO

		lblTitulo.setBounds(20, 20, 200, 20);
		objPainel.add(lblTitulo);
		txtTitulo.setBounds(20, 40, 400, 20);
		objPainel.add(txtTitulo);

		// CONFIGURAÇÃO AUTOR

		lblAutor.setBounds(20, 20, 200, 20);
		objPainel.add(lblAutor);
		cboAutor.setBounds(20, 40, 400, 20);
		objPainel.add(cboAutor);
		cboAutor.addItem("");

		try {
			colecao = Autor.getTodos();
			for (Autor objAutor : colecao) {
				cboAutor.addItem(objAutor.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		// BOTÕES

	}
}
