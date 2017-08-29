package br.com.banco;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.bancoprogresso.Conta;

public class TesteConta {
	
private Conta conta;
	
	@Before
	public void before() {
		conta = new Conta("Marcelo", "2-2", "123-4");
	}

	@Test
	public void test() {
		assertEquals(conta.GetTitular(), "Marcelo");
		assertEquals(conta.GetSaldo(), 0, 0);
	}

}

