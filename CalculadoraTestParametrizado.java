package codigo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTestParametrizado {

	private int num1;
	private int num2;
	private int res;
	Calculadora cal;
	private Calculadora calcu;
	
	public CalculadoraTestParametrizado (int num1, int num2, int reul) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.res = res;
		
	}
	
		@Parameters
		public static Collection<Object[]> init(){
			
		
		return Arrays.asList(new Object[][] { {2,4,6},{4,5,9},{5,5,10} } );
		}
	
		@Test
		public void testsuma() {
			Calculadora calcu = new Calculadora(num1, num2);
			int res = calcu.suma();
			assertEquals("La prueba ", res, calcu.suma());
			
		}
		@Test
		public void testresta() {
			Calculadora calcu = new Calculadora(num1, num2);
			int res = calcu.resta();
			assertEquals("La prueba ", res, calcu.resta());

		}
		@Test
		public void testmultiplica() {
			Calculadora calcu = new Calculadora(num1, num2);
			int res = calcu.multiplica();
			assertEquals("La prueba ", res, calcu.multiplica());
		}
}

