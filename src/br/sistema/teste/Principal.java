package br.sistema.teste;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Principal p = new Principal();
		Scanner sc = new Scanner(System.in);
		
		p.TelaInicial(sc);
		
		
	}
	
	public void TelaInicial(Scanner sc) {
		String s = "";		
		while(!s.equalsIgnoreCase("L") && !s.equalsIgnoreCase("C") ) 
		{
			System.out.println("----------- Tela Inicial ----------- \n");
			System.out.println("Digite 'L' para fazer login, ou 'C' para se cadastrar: ");		
			s = sc.nextLine();
			
			if(s.equalsIgnoreCase("L")) 
			{
				System.out.println("-----------------------------------\n");
				System.out.println("----------- Login -----------------\n");
			}
			else if(s.equalsIgnoreCase("C")) {
				System.out.println("-----------------------------------\n");
				System.out.println("----------- Cadastro --------------\n");
			}
			else 
			{
				System.out.println("Resposta Inválida. \n");
				System.out.println("------------------------------------\n");
			}
		}	
	}
	
}
