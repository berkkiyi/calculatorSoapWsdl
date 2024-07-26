package com.wcf.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;



@Configuration
public class CalculatorClientConfiguration {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		final Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.wcf.wsdl");
		return marshaller;
	}

	@Bean
	public CalculatorClient calculatorclient(Jaxb2Marshaller marshaller) {
		final CalculatorClient client = new CalculatorClient();
		client.setDefaultUri("http://www.dneonline.com/calculator.asmx");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
