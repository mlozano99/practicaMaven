package es.upv.weather.test;

import java.io.InputStream;

import junit.framework.TestCase;

import org.upv.ufasu.weather.Weather;
import org.upv.ufasu.weather.YahooParser;



public class YahooParserTest extends TestCase{
	
	public void testParser() throws Exception {
	InputStream valenciaData =
	getClass().getClassLoader().getResourceAsStream("valencia-weather.xml");
	Weather weather = new YahooParser().parse( valenciaData );
	
    assertEquals( "Valencia", weather.getCity() );
	assertEquals( "SP", weather.getCountry() );
	assertEquals( "70", weather.getTemp() );
	assertEquals( "Fair", weather.getCondition() );
	assertEquals( "70", weather.getChill() );
 	assertEquals( "21", weather.getHumidity() );
	}
}

