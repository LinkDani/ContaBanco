package br.com.bancoprogresso;

public class Sistema {
	

	public String Nome;
	public String Agencia;
	public String Numero;
	
	public Sistema(String nome, String agencia) {
		this(nome, agencia, null);
}
	public Sistema(String nome, String agencia, String numero) {
		this.Nome = nome;
		this.Agencia = agencia;
		this.Numero = numero; 
}
	public void ImprimeDados() {
		System.out.println("O nome é: " + this.Nome);
		System.out.println("O nome da Agência é: " + this.Agencia);
		System.out.println("O seu número é: " + this.Numero);
		
	}
	
	}
	
