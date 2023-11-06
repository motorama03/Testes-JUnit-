package TestesJunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class JUnitTeste extends TestCase{
	
	Operacao op = new Operacao();
	
	public void testAdicao() {
		assertEquals(4.0, op.adicao(2, 2));
		assertEquals(3.0, op.adicao(1, 1));
		assertEquals(6.0, op.adicao(2, 4));
	}
	public void testSubtracao() {
		assertEquals(4.0, op.subtracao(2, 2));
		assertEquals(3.0, op.subtracao(1, 1));
		assertEquals(6.0, op.subtracao(2, 4));
	}
	public void testMultiplicacao() {
		assertEquals(4.0, op.multiplicao(2, 2));
		assertEquals(3.0, op.multiplicao(1, 1));
		assertEquals(6.0, op.multiplicao(2, 4));
	}
	public void testDivisao() {
		assertEquals(4.0, op.divisao(2, 2));
		assertEquals(3.0, op.divisao(1, 1));
		assertEquals(6.0, op.divisao(2, 4));
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
