package com.calculatorAssessment.calculatorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.calculatorAssessment.calculator.StringCalculator;

public class StringCalculatorTest {
	
	@Test
	public void returnZeroForEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	
	@Test
	public void returnSameNumber() {
		assertEquals(1, StringCalculator.add("1"));
	}
	
	@Test
	public void returnSumOfTwoNumbersDelimitedByComma() {
		assertEquals(3, StringCalculator.add("1,2"));
	}
}
