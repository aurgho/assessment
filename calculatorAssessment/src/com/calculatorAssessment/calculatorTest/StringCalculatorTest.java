package com.calculatorAssessment.calculatorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.calculatorAssessment.calculator.StringCalculator;

public class StringCalculatorTest {
	
	@Test
	public void returnZeroForEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	
}
