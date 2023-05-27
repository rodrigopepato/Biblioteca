package apresentacao;

import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Autor;

public class VisaoLivro extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblTitulo = new JLabel("Titulo");
	private JTextField txtTitulo = new JTextField();
	
	
	private JLabel lblAutor = new JLabel ("Autor");
	private JComboBox <String> cboAutor = new JComboBox <String>();
	private Collection<Autor> colecao = null;
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	//metodo pricipal de execulção da classe
	
	public static void main(String[] args) {
		new VisaoLivro().setVisible(true);
	}
	
	public VisaoLivro() {
		setTitle("Cadastro de livros");
		setSize(450, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
