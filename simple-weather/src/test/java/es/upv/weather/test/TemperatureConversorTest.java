package es.upv.weather.test;

import es.upv.conversor.TemperatureConversor;
import junit.framework.TestCase;

public class TemperatureConversorTest extends TestCase{

	
	public void testConversor() throws Exception{
		
		TemperatureConversor conversor = new TemperatureConversor();		
		int celsius = conversor.fahrenheitToCelsius(50);
	    assertEquals(10, celsius);	
	}

}
