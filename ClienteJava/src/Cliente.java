public class Cliente {
	
	//atributos da classe
	private String nome;
	private String cpf;
	
	//construtor vazio
	public Cliente() {
		
	}
	//construtor que pede nome e cpf
	public Cliente(String nome, String cpf) {
		
		this.nome = nome;
		this.cpf = cpf;
	}
	//getters e setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
}
