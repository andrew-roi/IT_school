package com.it_school.lecture20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 1. С помощью Stream API отфильтровать только четные числа и сформировать новый список из квадратов их значений.
 *
 * Input: [1, 2, 3, 4, 5]
 *
 * Output: [4, 16]
 * 2. Написать функцию-Predicat.
 * Предикат должен принимать коллекцию строк и проверять содержится ли в ней больше 2 строк,
 * которые начинаются с заглавной буквы (upper case). Эту проверку также нужно сделать с помощью Stream API.
 * Используйте функцию count() из Stream
 * 3. Написать энам MathOperations со значениями PLUS, MINUS, DIVIDE, MULTIPLY.
 * Составить карту функций, ключи - значения энама. Значения - функции (BiFunction), которые выполняют соответствующие действия.
 * 4*. Написать интерфейс TriFunction, который представляет собой функцию,
 * которая принимает 3 параметра и имеет возращаемое значение.
 */

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

        MathOperations Plus = MathOperations.PLUS;
        MathOperations Minus = MathOperations.MINUS;
        MathOperations Divide = MathOperations.DIVIDE;
        MathOperations Multiply = MathOperations.MULTIPLY;

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
