package br.sistema.contas;

public abstract class Usuario {
	private String nome;
	private String telefone;
	private String email;
	
	
	//Constructors
	public Usuario() {}
	public Usuario(String nome) {
		this.nome = nome;
	}
	public Usuario(String nome,String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	public Usuario(String nome,String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}	
	
	//Getters & Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
