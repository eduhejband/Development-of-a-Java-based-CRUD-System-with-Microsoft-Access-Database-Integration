
public class Produto {
	private Integer id;
	private String nome;
	private Double preco;
	private Integer qtde;
	private Fornecedor fornecedor;
	
	public Produto() {
		
		
	}
	
	public Produto(Integer id, String nome, Double preco, Integer qtde, Fornecedor fornecedor) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
		this.fornecedor = fornecedor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getQtde() {
		return qtde;
	}
	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	
}
