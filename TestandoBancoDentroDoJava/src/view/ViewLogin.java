

package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dao.Conexao;


public class ViewLoginVulneravel extends JFrame implements ActionListener{
	private JTextField txtNomeUsuario;
	private JLabel lblNomeUsuario;
	private JButton btnLogin;
	private JPanel formulario;
	
	public ViewLoginVulneravel() {
		super("Login");
		txtNomeUsuario = new JTextField(10);
		lblNomeUsuario = new JLabel("Nome do usuário");
		formulario = new JPanel(new GridLayout(1,2));
		formulario.add(lblNomeUsuario);
		formulario.add(txtNomeUsuario);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		setLayout(new GridLayout(2,1));
		add(formulario);
		add(btnLogin);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==btnLogin) {
			Conexao banco = new Conexao();
			banco.abrirConexao();
			if(banco.loginVulneravel(txtNomeUsuario.getText())) {
				ViewTeste janela = new ViewTeste();
				janela.setSize(400,130);
				janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
				janela.show();
				this.dispose();
			}else {
				JOptionPane.showMessageDialog(null, "Login inválido");
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ViewLoginVulneravel janela = new ViewLoginVulneravel();
		janela.setSize(400,130);
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.show();
	}

}
