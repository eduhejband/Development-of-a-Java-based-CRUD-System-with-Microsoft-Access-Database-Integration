package dao;
/*Essa classe ser� usada para manipularmos nossa conex�o com o banco de dados!
 * Nela faremos a conex�o
 * O envio de instru��es que modificam os dados de uma tabela
 * O envio de instru��es que retornam dados de uma tabela
 * */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Conexao {
	   private String url;
	   private String usuario;
	   private String senha;
	   private Connection conexao;
       /*O atributo abaixo armazena e executa um comando SQL.
        * Por�m, ele faz isso deixando margem para um
        * SQL Injection (um ataque que pode prejudicar o sistema)*/
	   private Statement comando;
       public Conexao() {
    	   
    	   url = "jdbc:ucanaccess://D:\\banco\\banco_teste.accdb;";
    	   usuario="";
    	   senha="";
    	   
       }
       
       /*Aten��o, o m�todo de "login" apresentado
        * abaixo est� vulner�vel e incorreto.
        * Est� presente apenas para fins DID�TICOS*/
       public boolean loginVulneravel(String nome) {
    	   /*Muitos programas usam um select pelo nome de usu�rio e senha para fazer
    	    * um login, retornando verdadeiro caso o registro correspondente
    	    * seja encontrado. O nosso login vulner�vel faz o mesmo, mas usando apenas o
    	    * nome do aluno*/
    	   try {
    		   ResultSet rs;
    		   comando=conexao.createStatement();
    		   rs = comando.executeQuery("Select * from alunos where nome_aluno='"+nome+"'");
    		   if(rs.next()) {
    			   return true;
    		   }else {
    			   return false;
    		   }
    	   }catch(SQLException erro) {
    		   erro.printStackTrace();
    		   return false;
    	   }
    	   
       }
       
       /*O m�todo abaixo insere dados na tabela aluno
        * usando o comando SQL "INSERT".
        * Quem � respons�vel por executar esse comando � o
        * statement "comando" que criamos como atributo.
        * Todo o c�digo est� em um Try para fazer o tratamento de erros.
        * SINTAXE: INSERT INTO TABELA (CAMPO1, CAMPO2) values (VALOR1, VALOR2)*/
       public void inserir(String nome, String email) {
    	   try {
    		   comando = conexao.createStatement();
    		   comando.execute("Insert into ALUNOS (nome_aluno, email_aluno) values ('"+nome+"', '" + email + "')");
    		   
    	   }catch(SQLException erro) {
    		   erro.printStackTrace();
    	   }
    	   
       }
       /*O m�todo abaixo atualiza dados na tabela aluno
        * usando o comando SQL "UPDATE".
        * Quem � respons�vel por executar esse comando � o
        * statement "comando" que criamos como atributo.
        * Todo o c�digo est� em um Try para fazer o tratamento de erros.
        * SINTAXE: UPDATE TABELA SET campo=valor, campo=valor WHERE condi��o*/
       public void atualizar(String nome, String email, int id) {
    	   try {
    		   comando = conexao.createStatement();
    		   comando.execute("Update ALUNOS set nome_aluno='" + nome + "', email_aluno='" + email + "' where id_aluno=" + id);
    	   }catch(SQLException erro) {
    		   erro.printStackTrace();
    	   }
       }
       /*O m�todo abaixo exclui dados na tabela aluno
        * usando o comando SQL "DELETE".
        * Quem � respons�vel por executar esse comando � o
        * statement "comando" que criamos como atributo.
        * Todo o c�digo est� em um Try para fazer o tratamento de erros.
        * SINTAXE: DELETE FROM tabela WHERE condi��o*/
       public void excluir(int id) {
    	   try {
    		   comando = conexao.createStatement();
    		   comando.execute("Delete from ALUNOS where id_aluno=" + id);
    	   }catch(SQLException erro) {
    		   erro.printStackTrace();
    	   }
       }
       /*O m�todo abaixo exclui dados na tabela aluno usando o comando SQL "SELECT"
        *Quem � respons�vel por executar esse comando � o statement "comando" que criamos como atributo.
        *Por se tratar de um SELECT (um comando que devolve dados ap�s a execu��o), ser� preciso
        *usar um ResultSet para receber os dados lidos. 
        *Todo o c�digo est� em um Try para fazer o tratamento de erros.
        *SINTAXE: SELECT campos FROM tabela WHERE condi��o*/
       public void exibir(int id) {
    	   try {
    		   comando = conexao.createStatement();
    		   ResultSet resultado = comando.executeQuery("Select * from ALUNOS where id_aluno="+id);
    		   resultado.next();
    		   JOptionPane.showMessageDialog(null, "O id � " + resultado.getString(1) + ", o nome � " + 
    		   resultado.getString(2) + ", o email � " + resultado.getString(3));
    	   }catch(SQLException erro) {
    		   erro.printStackTrace();
    		   
    	   }
    	   
       }
       
       
       
       
       
       public void abrirConexao() {

           try {
               conexao = DriverManager.getConnection(url, usuario, senha);
           } catch (SQLException e) {
               e.printStackTrace();
           }
        
       }
       

       
       public void fecharConexao(){
           try {
               conexao.close();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
	   
	   
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
