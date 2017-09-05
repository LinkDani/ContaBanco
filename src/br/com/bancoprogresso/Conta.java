package br.com.bancoprogresso;

public class Conta {

		private String agencia;
		private String conta;
		private String titular;
		private double saldo;
		String nome;
		String numero;
		
		public Conta(String titular, String agencia, String conta) {
			this.titular = titular;
			this.agencia = "";
			this.conta = conta;
			this.saldo = 500;
		}
		
		public String GetTitular() {
			return this.titular;
		}
		
		public double GetSaldo() {
			return this.saldo;
		}
		
		public double Credito(double valor){
			return this.saldo += valor;
		}
		
		public double Debito(double valor){
			return this.saldo -= valor;
		}
		
		}


