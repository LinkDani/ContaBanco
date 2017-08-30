package br.com.bancoprogresso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Cadastro de conta");
		
		System.out.println("Digite o nome: ");
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o nome da Agência: ");
		Scanner q = new Scanner(System.in);
		System.out.println("Digite seu número: ");
		Scanner l = new Scanner(System.in);
		String nome = s.next();
		String agencia = q.next();
		String numero = l.next();
		System.out.println("O nome é: " + nome);
		System.out.println("O nome da Agência é: " + agencia);
		System.out.println("O seu número é: " + numero);
		
		//Conta conta = new Conta(nome, agencia, numero);
		//conta.ImprimeDados();
	}

}
