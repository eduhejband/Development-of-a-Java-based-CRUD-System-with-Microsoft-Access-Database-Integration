import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ViewFornecedor extends JFrame implements ActionListener{
	//Os atributos abaixo representam os objetos
	//que serão exibidos na janela
	private JLabel lblId;
	private JLabel lblNomeFantasia;
	private JLabel lblRazaoSocial;
	private JLabel lblCnpj;
	private JLabel lblEmail;
	private JLabel lblTelefone;
	private JLabel lblLogradouro;
	private JLabel lblNumero;
	private JLabel lblComplemento;
	private JLabel lblCep;
	
	private JTextField txtId;
	private JTextField txtNomeFantasia;
	private JTextField txtRazaoSocial;
	private JTextField txtCnpj;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtCep;
	
	private JButton btnOk;
	private JButton btnAlterar;
	private JButton btnExcluir;
	private JButton btnLocalizar;
	//além dos objetos acima, criaremos 2 paineis
	//para podermos agrupar os objetos em áreas diferentes
	private JPanel painelFormulario;
	private JPanel painelBotoes;
	
	public ViewFornecedor() {
	   	super("Fornecedores");
        setLayout(new BorderLayout());//O layout da janela está definido como border
        							//para que possamos ocupar as 5 regiões (N,S,W,E,C)
		
        //para agrupar os objetos que compõem o formulário de cadastro, vamos add
        //todos eles em um JPanel, gerido pelo GridLayout
        painelFormulario = new JPanel();
        painelFormulario.setLayout(new GridLayout(10,2));//o painel está dividido em
        												//7 linhas e duas colunas
		//para cada campo pertencente ao formulário, vamos adicioná-los ao painel
        //usando o método add
        lblId = new JLabel("Id: ");
		painelFormulario.add(lblId);
		txtId=new JTextField(10);
		painelFormulario.add(txtId);
	
		lblNomeFantasia = new JLabel("Nome: ");
		painelFormulario.add(lblNomeFantasia);
		txtNomeFantasia=new JTextField(10);
		painelFormulario.add(txtNomeFantasia);
		
		lblRazaoSocial = new JLabel("Nome: ");
		painelFormulario.add(lblRazaoSocial);
		txtRazaoSocial=new JTextField(10);
		painelFormulario.add(txtRazaoSocial);
		
		lblCnpj = new JLabel("CPF: ");
		painelFormulario.add(lblCnpj);
		txtCnpj=new JTextField(10);
		painelFormulario.add(txtCnpj);
		
		lblEmail  = new JLabel("CPF: ");
		painelFormulario.add(lblEmail);
		txtEmail=new JTextField(10);
		painelFormulario.add(txtEmail);
		
		lblTelefone  = new JLabel("CPF: ");
		painelFormulario.add(lblTelefone);
		txtTelefone=new JTextField(10);
		painelFormulario.add(txtTelefone);
		
		lblLogradouro = new JLabel("Rua: ");
		painelFormulario.add(lblLogradouro);
		txtLogradouro=new JTextField(10);
		painelFormulario.add(txtLogradouro);
		
		lblNumero = new JLabel("Nº: ");
		painelFormulario.add(lblNumero);
		txtNumero=new JTextField(10);
		painelFormulario.add(txtNumero);
		
		lblComplemento = new JLabel("Complemento: ");
		painelFormulario.add(lblComplemento);
		txtComplemento=new JTextField(10);
		painelFormulario.add(txtComplemento);
		
		lblCep = new JLabel("CEP: ");
		painelFormulario.add(lblCep);
		txtCep=new JTextField(10);
		painelFormulario.add(txtCep);
		

		//para os 4 botões, vamos utilizar um outro painel, gerido pelo FlowLayout
		painelBotoes = new JPanel();
		painelBotoes.setLayout(new FlowLayout());
		
		btnOk = new JButton("Cadastrar");
		painelBotoes.add(btnOk);
		btnOk.addActionListener(this);
		
		btnAlterar = new JButton("Alterar");
		painelBotoes.add(btnAlterar);
		
		btnLocalizar = new JButton("Localizar");
		painelBotoes.add(btnLocalizar);
		
		btnExcluir = new JButton("Excluir");
		painelBotoes.add(btnExcluir);
		
		//uma vez que os paineis estão montados, falta adicioná-los ao JFrame que estamos montando
		add(painelFormulario, BorderLayout.CENTER);
		add(painelBotoes, BorderLayout.SOUTH);
		
	}
	//Esse método é disparado quando uma ação for realizada dentro da tela em
	//algum dos objetos que está com o ActionListener adicionado
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==btnOk) {
			JOptionPane.showMessageDialog(null,"Cliente Cadastrado!");
		}
	}
	public static void main(String[] args) {
	   	ViewFornecedor janelinha = new ViewFornecedor();//criando a janela
        janelinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelinha.setSize(400,320);
        janelinha.setVisible(true);

	}

}
