package pruebasjunit.banh.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import pruebasjunit.banh.app.Calculadora;

class CalculadoraTest 
{
	private Calculadora ct;
	private Calculadora ct1 = null;
	
	@BeforeEach
	public void configurandoBefore()
	{
		ct = new Calculadora();
		System.out.println("Ejecutanto before --> configurandoBefore() ");
	}
	
	@AfterEach
	public void configurandoAfter()
	{
		ct = null;
		System.out.println("Ejecutando AferEach() --> configurandoAfter()");
		System.out.println("---------------------------------------------");
	}
	
	@Test
	public void calculadoraNull() 
	{
		assertNull(ct1, "La clase es una instancia no nula");
		System.out.println("Ejecuntando primer test de Calculadora");
	}
	
	@Test
	public void calculadoraNotNull() 
	{
		assertNotNull(ct, "La clase esta instanciada");
		System.out.println("Ejecuntando segundo test de Calculadora");
	}
	
	//Primeras pruebas
	
	@Test
	public void primerosAssert()
	{
		/*
		 * 1. Indica que se va a evaluar
		 * 2. Indica lo que se va a realizar
		 * 3. Evaluar con el assert indicado
		 */
		
		int resultadoEsperado = 10;
		int resultadoActual;
		
		resultadoActual = ct.sumar(7, 3);
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("Ejecutando tercer test de Calculadora");
	}
	
	@Test
	public void sumaTest()
	{
		Calculadora calc = new Calculadora();
		assertEquals(20, calc.sumar(10, 10));
		System.out.println("Ejecutando cuarto test de Calculadora");
	}
	
	// Tipos Test
	
	@Test
	public void tiposAsserts()
	{
		assertTrue(1 == 1);
		assertEquals("Generation", "Generation");
		assertNull(ct1);
		
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = c1;
		
		assertSame(c1, c3);
		assertNotSame(c2, c3);
		assertEquals(1,1.2,.5);
	}
	
	@Test
	public void validandoSuma()
	{
		assertEquals(11,ct.sumar(5, 6));
	}
	
	@Test
	public void validandoResta()
	{
		assertEquals(50,ct.restar(56, 6));
	}
	
	@Test
	public void validandoRestaNegativa()
	{
		assertEquals(-10,ct.restar(10, 20));
	}
	
	@Test
	public void validandoDivision()
	{
		assertEquals(2, ct.division(10, 5));
	}
	
	@Test
	public void validandoByZero()
	{
		assertThrows(ArithmeticException.class, () -> ct.divisionByZero(10, 0), "No se puede dividir por cero");
	}
}