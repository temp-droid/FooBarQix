package com.example.foobarqix;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FooBarQix {

    public static final String ASTERISK = "*";
    public static final String FOO = "Foo";
    public static final String BAR = "Bar";
    public static final String QIX = "Qix";

    private static final Map<Integer, String> DIVISION_SYMBOLS = new TreeMap<>();
    private static final Map<Integer, String> TRACE_SYMBOLS = new TreeMap<>();

    static {
        DIVISION_SYMBOLS.put(3, FOO);
        DIVISION_SYMBOLS.put(5, BAR);
        DIVISION_SYMBOLS.put(7, QIX);
    }

    static {
        TRACE_SYMBOLS.put(0, ASTERISK);
        TRACE_SYMBOLS.put(3, FOO);
        TRACE_SYMBOLS.put(5, BAR);
        TRACE_SYMBOLS.put(7, QIX);
    }

    public static String compute(String input) {
        String result = "";
        int number = Integer.parseInt(input);

        result += DIVISION_SYMBOLS.entrySet().stream()
                .filter(canDivide(number))
                .map(Map.Entry::getValue)
                .collect(Collectors.joining());

        result += input.chars()
                .mapToObj(Character::getNumericValue)
                .filter(TRACE_SYMBOLS::containsKey)
                .map(TRACE_SYMBOLS::get)
                .collect(Collectors.joining());

        if (result.replace(ASTERISK, "").isEmpty()) {
            return input.replace("0", ASTERISK);
        }

        return result;
    }

    private static Predicate<Map.Entry<Integer, String>> canDivide(int number) {
        return entry -> number % entry.getKey() == 0;
    }
}
