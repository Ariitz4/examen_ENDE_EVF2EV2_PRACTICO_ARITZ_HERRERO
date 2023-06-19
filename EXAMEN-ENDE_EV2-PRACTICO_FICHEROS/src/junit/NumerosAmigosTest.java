package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosAmigosTest {

	@Test
	public void testAmigoMal() {
		NumerosAmigos numAmg= new NumerosAmigos(200, 12);
		boolean resultado=numAmg.amigo();
		assertFalse(resultado);
	}
	@Test
	public void testAmigoPerfecto() {
		NumerosAmigos numAmg= new NumerosAmigos(220, 284);
		boolean resultado=numAmg.amigo();
		assertTrue(resultado);
	}

	@Test
	public void testEsCeroN1() {
		NumerosAmigos numAmg= new NumerosAmigos(0, 284);
		Integer resultado=numAmg.esN1IgualAN2();
		assertNull(resultado);
	}
	
	@Test
	public void testN1yN2SonIguales() {
		int valoresperado=1;
		NumerosAmigos numAmg= new NumerosAmigos(284, 284);
		int resultado=numAmg.esN1IgualAN2();
		assertEquals(valoresperado, resultado);
	}
	@Test
	public void testN1yN2NoSonIguales() {
		int valoresperado=1;
		NumerosAmigos numAmg= new NumerosAmigos(234, 284);
		int resultado=numAmg.esN1IgualAN2();
		assertNotEquals(valoresperado, resultado);
	}

}
