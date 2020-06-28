package com.calculatorAssessment.calculatorTest;

import static org.junit.Assert.fail;
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
	
	@Test
	public void returnSumOfAllNumbersDelimitedByComma() {
		assertEquals(6, StringCalculator.add("1,2,3"));
	}
	
	@Test
	public void returnSumOfAllNumbersDelimitedByNewLineOrComma() {
		assertEquals(6, StringCalculator.add("1,2\n3"));
	}
	
	@Test
	public void returnSumOfAllNumbersUsingCustomDelimiter() {
		assertEquals(3, StringCalculator.add("//;\n1;2"));
	}
	
	@Test
	public void returnExceptionIfNegative() {
		try {
			StringCalculator.add("-1,2,3");
			fail("negatives not allowed : -1");
		}catch (RuntimeException e) {

		}
	}
}
