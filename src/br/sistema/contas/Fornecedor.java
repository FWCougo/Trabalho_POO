package br.sistema.contas;

public class Fornecedor extends Usuario {

	private String descricao;	
	
	//Constructors
	public Fornecedor() {
		super();		
	}	
	public Fornecedor(String nome) {
		super(nome);		
	}	
	public Fornecedor(String nome, String telefone) {
		super(nome, telefone);		
	}
	public Fornecedor(String nome, String telefone, String email) {
		super(nome, telefone, email);		
	}	
	
	
	//Getters & Setters
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
