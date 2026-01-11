package com.neoversity;

import java.util.*;
import java.util.stream.*;

public class Assignments {

    public static String task1(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 1)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }

    public static List<String> task2(List<String> items) {
        return items.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static String task3(String[] array) {
        return Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static Stream<Long> task4(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static <T> Stream<T> task5(Stream<T> first, Stream<T> second) {
        Iterator<T> it1 = first.iterator();
        Iterator<T> it2 = second.iterator();

        List<T> result = new ArrayList<>();

        while (it1.hasNext() && it2.hasNext()) {
            result.add(it1.next());
            result.add(it2.next());
        }

        return result.stream();
    }
}
