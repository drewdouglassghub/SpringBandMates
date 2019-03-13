package controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Band.beans.Contact;
import Band.beans.Musician;


@Configuration
public class BeanConfiguration {

	@Bean
	public Musician musician() {
		Musician bean = new Musician();		
		return bean;
	}
	
	
	@Bean
	public Contact contact() {
		Contact bean = new Contact("555-555-5555", "drew@email.com");	
		return bean;		
	}
}
