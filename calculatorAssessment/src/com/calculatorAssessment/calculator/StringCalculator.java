package com.calculatorAssessment.calculator;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator {

	public static int add(String data) {
		if (data.isEmpty())
			return 0;
		else {
			List<String> list = Pattern.compile("\\p{Punct}|\\p{Space}").splitAsStream(data).collect(Collectors.toList());
			list.removeAll(Collections.singleton(""));
			return convertToInt(list);
		}
	}

	private static int convertToInt(List<String> list) {
		return list.stream().mapToInt(Integer::parseInt).sum();
	}

}
