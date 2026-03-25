package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
    	public void testAdd() {
		CalculatorApplication calc = new CalculatorApplication();
		assertEquals(4, calc.add(2, 2));
    	}

    	@Test
    	public void testSubtract() {
		CalculatorApplication calc = new CalculatorApplication();
		assertEquals(1, calc.subtract(3, 2));
    	}

}
