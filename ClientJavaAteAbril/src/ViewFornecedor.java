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
	//que ser�o exibidos na janela
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
	//al�m dos objetos acima, criaremos 2 paineis
	//para podermos agrupar os objetos em �reas diferentes
	private JPanel painelFormulario;
	private JPanel painelBotoes;
	
	public ViewFornecedor() {
	   	super("Fornecedores");
        setLayout(new BorderLayout());//O layout da janela est� definido como border
        							//para que possamos ocupar as 5 regi�es (N,S,W,E,C)
		
        //para agrupar os objetos que comp�em o formul�rio de cadastro, vamos add
        //todos eles em um JPanel, gerido pelo GridLayout
        painelFormulario = new JPanel();
        painelFormulario.setLayout(new GridLayout(10,2));//o painel est� dividido em
        												//7 linhas e duas colunas
		//para cada campo pertencente ao formul�rio, vamos adicion�-los ao painel
        //usando o m�todo add
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
		
		lblNumero = new JLabel("N�: ");
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
		

		//para os 4 bot�es, vamos utilizar um outro painel, gerido pelo FlowLayout
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
		
		//uma vez que os paineis est�o montados, falta adicion�-los ao JFrame que estamos montando
		add(painelFormulario, BorderLayout.CENTER);
		add(painelBotoes, BorderLayout.SOUTH);
		
	}
	//Esse m�todo � disparado quando uma a��o for realizada dentro da tela em
	//algum dos objetos que est� com o ActionListener adicionado
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
