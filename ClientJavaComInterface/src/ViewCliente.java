import java.awt.FlowLayout;
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ViewCliente extends JFrame implements ActionListener{
	private JLabel lblId;
	private JLabel lblNome;
	private JLabel lblLogradouro;
	private JLabel lblNumero;
	private JLabel lblComplemento;
	private JLabel lblCep;
	private JLabel lblCpf;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtCep;
	private JTextField txtCpf;
	private JButton btnOk;
	
	public ViewCliente() {
	   	 super("Clientes");
         setLayout(new FlowLayout());
				
		lblId = new JLabel("Id: ");
		add(lblId);
		txtId=new JTextField(10);
		add(txtId);
	
		lblNome = new JLabel("Nome: ");
		add(lblNome);
		txtNome=new JTextField(10);
		add(txtNome);
		
		lblLogradouro = new JLabel("Rua: ");
		add(lblLogradouro);
		txtLogradouro=new JTextField(10);
		add(txtLogradouro);
		
		lblNumero = new JLabel("Nº: ");
		add(lblNumero);
		txtNumero=new JTextField(10);
		add(txtNumero);
		
		lblComplemento = new JLabel("Complemento: ");
		add(lblComplemento);
		txtComplemento=new JTextField(10);
		add(txtComplemento);
		
		lblCep = new JLabel("CEP: ");
		add(lblCep);
		txtCep=new JTextField(10);
		add(txtCep);
		
		lblCpf = new JLabel("CPF: ");
		add(lblCpf);
		txtCpf=new JTextField(10);
		add(txtCpf);
		
		btnOk = new JButton("Cadastrar");
		add(btnOk);
		btnOk.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==btnOk) {
			JOptionPane.showMessageDialog(null,"Cliente Cadastrado!");
		}
	}
	public static void main(String[] args) {
	   	ViewCliente janelinha = new ViewCliente();//criando a janela
        janelinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelinha.setSize(100,180);
        janelinha.setVisible(true);

	}

}
