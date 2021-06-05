package com.example.foobarqix;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FooBarQix {

    public static final String FOO = "Foo";
    public static final String BAR = "Bar";
    public static final String QIX = "Qix";

    private static final Map<Integer, String> symbols = new TreeMap<>();

    static {
        symbols.put(3, FOO);
        symbols.put(5, BAR);
        symbols.put(7, QIX);
    }

    public static String compute(String input) {
        String result = "";

        result += symbols.entrySet().stream()
                .filter(divisibleBy(input))
                .map(Map.Entry::getValue)
                .collect(Collectors.joining());

        result += input.chars()
                .mapToObj(Character::getNumericValue)
                .filter(symbols::containsKey)
                .map(symbols::get)
                .collect(Collectors.joining());

        if (result.isEmpty()) {
            return input;
        }

        return result;
    }

    private static Predicate<Map.Entry<Integer, String>> divisibleBy(String input) {
        return entry -> Integer.parseInt(input) % entry.getKey() == 0;
    }
}
