package com.calculatorAssessment.calculator;



public class StringCalculator {

	public static int add(String data) {
		if (data.isEmpty())
			return 0;
		else if(data.contains(","))
		{
			String[] numbers = data.split(",");
			return StringtoInt(numbers[0])+StringtoInt(numbers[1]);
		}
		else
			return StringtoInt(data);
	}
	
	private static int StringtoInt(String num) {
		return Integer.parseInt(num);
	}
	
}
