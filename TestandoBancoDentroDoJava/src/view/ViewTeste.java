package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dao.Conexao;

/* Essa � uma classe criada para representar um formul�rio que permita:
 * CONECTAR COM O BANCO DE DADOS
 * GRAVAR DADOS EM UMA TABELA CHAMADA TESTE
 * LER UM DADO LIDO
 * ALTERAR UM DADO LIDO
 * EXCLUIR UM DADO LIDO
 * 
 * Depois de entender como o Java se conecta com um banco e manipula seus dados, vamos aplicar os mesmos
 * conhecimentos no projeto Walduino*/
public class ViewTeste extends JFrame implements ActionListener{
	private JPanel painelFormulario;
	private JLabel lblIdAluno;
	private JTextField txtIdAluno;
	private JLabel lblNomeAluno;
	private JTextField txtNomeAluno;
	private JLabel lblEmailAluno;
	private JTextField txtEmailAluno;
	
	
	private JPanel painelBotoes;
	private JButton btnGravar;
	private JButton btnLer;
	private JButton btnAlterar;
	private JButton btnExcluir;
	
	public ViewTeste() {
		/*Abaixo temos a parte do c�digo que monta os objetos
		 * dentro do formul�rio.
		 * Esse conte�do foi abordado no 1� Semestre do curso
		 */
		painelFormulario = new JPanel(new GridLayout(3,4,3,3));
		lblIdAluno = new JLabel("Id do aluno:");
		txtIdAluno = new JTextField(10);
		lblNomeAluno = new JLabel("Nome do aluno:");
		txtNomeAluno = new JTextField(10);
		lblEmailAluno = new JLabel("Email");
		txtEmailAluno = new JTextField(10);
		
		painelFormulario.add(lblIdAluno);
		painelFormulario.add(txtIdAluno);
		painelFormulario.add(lblNomeAluno);
		painelFormulario.add(txtNomeAluno);
		painelFormulario.add(lblEmailAluno);
		painelFormulario.add(txtEmailAluno);
		
		painelBotoes = new JPanel(new GridLayout(1,4,3,3));
		btnGravar = new JButton("Gravar");
		btnLer = new JButton("Ler");
		btnAlterar = new JButton("Alterar");
		btnExcluir = new JButton("Excluir");
		
		painelBotoes.add(btnGravar);
		painelBotoes.add(btnLer);
		painelBotoes.add(btnAlterar);
		painelBotoes.add(btnExcluir);
		
		btnGravar.addActionListener(this);
		btnLer.addActionListener(this);
		btnAlterar.addActionListener(this);
		btnExcluir.addActionListener(this);

		setLayout(new BorderLayout(5,5));
		add(painelFormulario, BorderLayout.CENTER);
		add(painelBotoes, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		/*Os c�digos abaixo servem para exibir
		 * o formul�rio que montamos, conforme estudado no primeiro semestre
		 * */
		ViewTeste janela = new ViewTeste();
		janela.setSize(400,130);
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.show();
	}
	/*Os c�digos abaixo atribuem a��es espec�ficas para cada um dos bot�es
	 * 
	 * */
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource()==btnGravar) {
			/*Aqui vamos inserir o que vai ocorrer 
			 * quando o bot�o GRAVAR for clicado*/
			Conexao banquinho = new Conexao();
			banquinho.abrirConexao();
			banquinho.inserir(txtNomeAluno.getText(), txtEmailAluno.getText());
			banquinho.fecharConexao();
			JOptionPane.showMessageDialog(null, "O aluno foi inserido");
		}else {
			if (event.getSource()==btnLer) {
			/*Aqui vamos inserir o que vai ocorrer 
			 * quando o bot�o LER for clicado*/
				Conexao banquinho = new Conexao();
				banquinho.abrirConexao();
				banquinho.exibir(Integer.parseInt(txtIdAluno.getText()));
				
			}else {
				if (event.getSource()==btnAlterar) {
			/*Aqui vamos inserir o que vai ocorrer 
			 * quando o bot�o ALTERAR for clicado*/
					Conexao banquinho = new Conexao();
					banquinho.abrirConexao();
					banquinho.atualizar(txtNomeAluno.getText(), txtEmailAluno.getText(), Integer.parseInt(txtIdAluno.getText()));
					banquinho.fecharConexao();
					JOptionPane.showMessageDialog(null, "O aluno foi alterado");
				}else {
					if (event.getSource()==btnExcluir) {
			/*Aqui vamos inserir o que vai ocorrer 
			 * quando o bot�o EXCLUIR for clicado*/
						Conexao banquinho = new Conexao();
						banquinho.abrirConexao();
						banquinho.excluir(Integer.parseInt(txtIdAluno.getText()));
						banquinho.fecharConexao();
						JOptionPane.showMessageDialog(null, "O aluno foi excluido");
					}
				}
			}
		}
		
	}

}
