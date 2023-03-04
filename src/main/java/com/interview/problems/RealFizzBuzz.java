package com.interview.problems;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RealFizzBuzz {

    private final static String WHITE_SPACE = " ";

    /**
     * Prints out the following for a contiguous range of numbers:
     * <p>
     * - the number
     * - 'fizz' for numbers that are multiples of 3
     * - 'buzz' for numbers that are multiples of 5
     * - 'fizzbuzz' for numbers that are multiples of 15
     * - if the number contains a three output the text lucky, overriding any existing behaviour
     * - report at the end of the program showing how many times each word was substituted
     *
     * @return the string representation of fizz buzz
     */
    public static String realFizzBuzz(int n) {
        var fizzBuzz = getFizzBuzz(n);

        return fizzBuzz +
                "\n" +
                Arrays.toString(getFrequencies(fizzBuzz).entrySet().toArray());
    }

    private static String getFizzBuzz(int n) {
        return IntStream.range(1, n + 1)
                .mapToObj(RealFizzBuzz::fizzBuzz)
                .collect(Collectors.joining(WHITE_SPACE));
    }

    private static Map<String, Long> getFrequencies(String fizzBuzz) {
        return Arrays.stream(fizzBuzz.split(WHITE_SPACE))
                .map(transformIntegers())
                .collect(Collectors.groupingBy(fr -> fr, // group by this
                        Collectors.mapping(
                                fr -> 1, // mapping each element to this
                                Collectors.counting())));
    }

    private static String fizzBuzz(int n) {
        if (String.valueOf(n).contains("3")) {
            return "lucky";
        } else if (n % 15 == 0) {
            return "fizzbuzz";
        } else if (n % 5 == 0) {
            return "buzz";
        } else if (n % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(n);
    }

    private static Function<String, String> transformIntegers() {
        return e -> {
            try {
                Integer.parseInt(e);
                return "integer";
            } catch (Exception ex) {
                return e;
            }
        };
    }
}
