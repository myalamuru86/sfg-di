package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.ConstuctorGreetingService;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller; 
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstuctorGreetingService());
	}

	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
	}

}
