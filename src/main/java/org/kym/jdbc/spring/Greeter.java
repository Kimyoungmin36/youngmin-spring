package org.kym.jdbc.spring;

public class Greeter {
	
	public Greeter() {
		System.out.println("Greeter instance created!");
	}
	
	public String greet() {
		return "Hello, Spring!";
	}
}