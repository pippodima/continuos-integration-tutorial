package com.example.continuos_integration_tutorial;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
	private App app;
	
	@BeforeEach
	public void setup() {
		app = new App();
	}
	
	@Test
	public void testSayHello() {
		assertEquals("Hello", app.sayHello());
	}
	
	
    
}
