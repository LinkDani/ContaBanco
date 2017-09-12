package br.com.bancoprogresso;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Banco banco = new Banco("BancoDoInstituto");		
			
			Conta conta = banco.AbreConta();		
			banco.ImprimeContas();
			
			Conta conta1 = banco.AbreConta();
			conta1.Credito(1000);
			banco.ImprimeContas();
		}
}
		
