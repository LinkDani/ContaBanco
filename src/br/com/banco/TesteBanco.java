package br.com.banco;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.bancoprogresso.Banco;
import br.com.bancoprogresso.Conta;

public class TesteBanco {
	@Test
	public void VerificaNome() {
		Banco banco = new Banco("Banco Teste");
		assertEquals("Banco Teste", banco.GetNome());		
	}

	@Test
	public void VerificaAberturaConta() {
		Banco banco = new Banco("Banco Teste");
		banco.AbreConta("Daniel", "101", "1010");
		
		Conta conta = banco.GetUltimaContaAberta();
		assertEquals("Daniel", conta.GetTitular());		
	}
	
	@Test
	public void VerificaUltimaContaAbertaDeBancoSemContas() {
		Banco banco = new Banco("Banco Teste");
		Conta conta = banco.GetUltimaContaAberta();
		assertNull(conta);
	}	
}

