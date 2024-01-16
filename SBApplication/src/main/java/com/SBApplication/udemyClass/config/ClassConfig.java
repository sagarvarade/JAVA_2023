package com.SBApplication.udemyClass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.SBApplication.udemyClass.Beans.Vehicle;

@Configuration
@ComponentScan("com.SBApplication.udemyClass.Beans")
public class ClassConfig {

	@Bean
	
	String hello()
	{
		return "Hello";
	}
	
	@Bean(name="AUDI")
	public Vehicle audi()
	{
		return new Vehicle("Audi");
	}
	
	@Bean(name="TOYOTA")
	@Primary
	public Vehicle toyota()
	{
		return new Vehicle("Toyota");
	}
	
	@Bean(name="TATA")
	
	public Vehicle Tata()
	{
		return new Vehicle("TATA");
	}
}
