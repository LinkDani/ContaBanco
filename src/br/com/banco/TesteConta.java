package br.com.banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.bancoprogresso.Conta;

public class TesteConta {
	
private Conta conta;
	
	@Before
	public void before() {
		conta = new Conta("Daniel", "2-2", "123-4");
	}

	@Test
	public void test() {
		assertEquals(conta.GetTitular(), "Daniel");
		assertEquals(conta.GetSaldo(), 500, 0);
	}
	
	@Test
	public void CreditoConta(){
		conta.Credito(100);
		assertEquals(600, conta.GetSaldo(), 0);
	
	}
	
	@Test
	public void DebitoConta(){
		conta.Debito(100);
		assertEquals(400, conta.GetSaldo(), 0);
	
	}
	

}

