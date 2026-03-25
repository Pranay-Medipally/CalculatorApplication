package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public int add(int a, int b){
		return a+b;
	}

	public int subtract(int a, int b){
		return a-b;
	}
}
