package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {
	public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

	public int add(int a, int b){
		return a+b;
	}

	public int subtract(int a, int b){
		return a-b;
	}
}
