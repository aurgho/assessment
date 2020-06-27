package com.calculatorAssessment.calculator;

public class StringCalculator {

	public static int add(String data) {
		if (data.isEmpty())
			return 0;
		else
			return Integer.parseInt(data);
	}

}
