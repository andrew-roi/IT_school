package com.it_school.lecture20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        filteringWithStream();
        predicateFunction();
        mathOperationsEnum();


    }

    public static void filteringWithStream() {

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> stream = list.stream()
                .filter(oddNumber -> oddNumber % 2 == 0)
                .map(doubleValue -> doubleValue * doubleValue)
                .collect(Collectors.toList());
        System.out.println(stream);
    }

    public static void predicateFunction() {
        List<String> list = new ArrayList<>();
        list.add("Card");
        list.add("Bard");
        list.add("Bank");
        list.add("ololo");
        list.add("asd");
        Pattern pattern = Pattern.compile("^[A-Z].*");
        Predicate<String> predicate = s -> s.matches(String.valueOf(pattern));

        long count = list.stream().filter(predicate).count();
        System.out.println(count);
    }

    public static void mathOperationsEnum() {
        Map<MathOperations, BiFunction<Integer, Integer, Integer>> map = new HashMap<>();

        MathOperations Plus = MathOperations.Plus;
        MathOperations Minus = MathOperations.Minus;
        MathOperations Divide = MathOperations.Divide;
        MathOperations Multiply = MathOperations.Multiply;

        BiFunction<Integer, Integer, Integer> plusFunction = (a,b ) -> a +b;
        BiFunction<Integer, Integer, Integer> minusFunction = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> divideFunction = (a, b) -> a / b;
        BiFunction<Integer, Integer, Integer> multiplyFunction = (a, b) -> a * b;

        map.put(Plus, plusFunction);
        map.put(Minus, minusFunction);
        map.put(Divide, divideFunction);
        map.put(Multiply, multiplyFunction);

        System.out.println(map.get(Plus).apply(5, 5));
        System.out.println(map.get(Minus).apply(5, 2));
        System.out.println(map.get(Divide).apply(2, 2));
        System.out.println(map.get(Multiply).apply(2, 2));
    }
}
