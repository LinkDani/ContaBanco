package br.com.bancoprogresso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Cadastro de conta");
		
		System.out.println("Digite o nome: ");
		String Nome = s.next();
		
		System.out.println("Digite o nome da Agência: ");
		String Agencia = s.next();
		
		System.out.println("Digite seu número: ");
		String Numero = s.next();
		
	
		Sistema candidato = new Sistema(Nome, Agencia, Numero);
		candidato.ImprimeDados();
	}

}
