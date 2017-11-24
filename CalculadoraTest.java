package codigo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

public class CalculadoraTest {

	@Test	public void testSuma() {
		Calculadora calcu = new Calculadora (2,1);
		 int resultado = calcu.suma();
		 assertEquals("la suma debe ser ",3, resultado);
	}
	
	@Test	public void testresta() {
		Calculadora calcu = new Calculadora (2,1);
		 int resultado = calcu.resta();
		 assertEquals("la resta debe ser ",1, resultado);
	}
	
	@Test	public void testmultiplica() {
		Calculadora calcu = new Calculadora (3,2);
		 int resultado = calcu.multiplica();
		 assertEquals("la multiplicación debe ser ",6, resultado);
	}
	
	@Test	public void testdivide() {
		Calculadora calcu = new Calculadora (6,3);
		 int resultado = calcu.divide();
		 assertEquals("la división debe ser ",2, resultado);
	}
	
	@Test	 public void testresta2() {
		Calculadora calcu = new Calculadora (2,1);
		 boolean resultado = calcu.resta2();
		 assertEquals("Nos devolvera ",true, resultado);
	}
	@Test	public void testdivide2() {
	Calculadora calcu = new Calculadora (6,3);
	 int resultado = calcu.divide2();
	 assertEquals("Nos devolvera ",2, resultado);
	
	}
}
