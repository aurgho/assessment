package com.calculatorAssessment.calculator;

import java.util.Arrays;
import java.util.List;

public class StringCalculator {

	public static int add(String data) {
		if (data.isEmpty())
			return 0;
		else {
			String[] numbers = data.split(",");
			return convertToInt(Arrays.asList(numbers));
		}
	}

	private static int convertToInt(List<String> list) {
		return list.stream().mapToInt(Integer::parseInt).sum();
	}

}
