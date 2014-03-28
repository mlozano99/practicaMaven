package org.upv.ufasu.weather;

import java.io.InputStream;

import es.upv.conversor.TemperatureConversor;

public class WeatherService {

    public WeatherService() {}

    public String retrieveForecast( String zip ) throws Exception {
	// Retrieve Data
	InputStream dataIn = new YahooRetriever().retrieve( zip );
	
	// Parse Data
	Weather weather = new YahooParser().parse( dataIn );
	TemperatureConversor conversor = new TemperatureConversor();
    weather.setTemp(  Integer.toString(  conversor.fahrenheitToCelsius(Integer.parseInt(weather.getTemp())) ) );
		
	// Format (Print) Data
	return new WeatherFormatter().format( weather);
    }	
}
