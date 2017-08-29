package br.com.banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.bancoprogresso.Correntista;

public class TesteCorrentista{

private Correntista correntista;
	@Before
	public void before() {
		correntista = new Correntista("Daniel", "123.123.123-12");
	}

	@Test
	public void test() {
		assertEquals(correntista.GetNome(), "Daniel");
		assertEquals(correntista.GetCPF(), "123.123.123-12");
	}

}
