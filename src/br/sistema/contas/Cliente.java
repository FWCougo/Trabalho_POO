package br.sistema.contas;

public class Cliente extends Usuario{
	
	private String cartaoCredito;

	//Contructors
	public Cliente() {
		super();		
	}	
	public Cliente(String nome) {
		super(nome);		
	}	
	public Cliente(String nome, String telefone) {
		super(nome, telefone);		
	}
	public Cliente(String nome, String telefone, String email) {
		super(nome, telefone, email);		
	}
	
	
	//Getters & Setters
	public String getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	
	

}
