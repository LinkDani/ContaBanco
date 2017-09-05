package br.com.bancoprogresso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Cadastro de conta");
		Sistema candidato = new Sistema("Daniel", "Instituto");
		candidato.ImprimeDados();
	}

}
