package racingcar;

import java.util.Arrays;
import java.util.List;

public class StringParser {
	public static List<String> parseCarNames(String input) {
		List<String> names = Arrays.asList(input.split(",", -1));

		Validator.validateCarNames(names);
		return names;
	}

	public static long parsePositiveNumber(String input) {
		long number;
		try {
			number = Long.parseLong(input);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid number input");
		}

		Validator.validatePositiveNumber(number);
		return number;
	}
}
