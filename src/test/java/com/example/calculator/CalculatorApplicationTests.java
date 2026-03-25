package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
    	public void testAdd() {
		CalculatorApplication calc = new CalculatorApplication();
		assertEquals(5, calc.add(2, 3));
    	}

    	@Test
    	public void testSubtract() {
		CalculatorApplication calc = new CalculatorApplication();
		assertEquals(1, calc.subtract(3, 2));
    	}

}
