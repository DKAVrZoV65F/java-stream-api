package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Step 1
        var resultStream =  Stream.of(1, 2, 3, 4, 5);
        var resultList = resultStream
                .filter(element -> element >= 2)
                .map(element -> element + " %")
                .collect(Collectors.toList());
        System.out.println(resultList);

//        Step 2
        Integer[] intArray = {10, 20, 30, 40, 50};
        List<Integer> resultArrays = Arrays.stream(intArray)
                .filter(element -> element >= 30)
                .toList();

        resultArrays.forEach(System.out::println);

//        Step 3
         List<String> list1 = List.of("hi", "he", "hey");
         var list2 = list1.stream()
                 .filter(e -> e.length() == 2)
                 .toList();
        System.out.println(list2);
        list2.forEach(System.out::println);

        List<Integer> list3 = List.of(2, 1, 6, 5);
        var list4 = list3.stream()
                .sorted()
                .limit(2)
                .toList();
        System.out.println(list4);

        var list5 = List.of(list3, List.of(3, 4));
        var list6 = list5.stream()
                .flatMap(e -> e.stream()
                        .filter(el -> el >= 4)).toList();
        System.out.println(list6);

        var list7 = list3.stream()
                .peek(System.out::println)
                .map(e -> e + 10)
                .filter(e -> e % 2 == 0)
                .toList();
        System.out.println(list7);

        boolean booleanResult1 = list3.stream()
                .anyMatch(e -> e == 5);
        System.out.println(booleanResult1);

        var list8 = list3.stream()
                .filter(e -> e > 4)
                .findFirst();
        System.out.println(list8.get());

        var list9 = List.of(1, 1, 2, 2, 3, 4);
        var list10 = list9.stream()
                .distinct()
                .toList();
        System.out.println(list10);

        var list11 = List.of(1, 2, 3, 4);
        var booleanResult2 = list11.stream()
                .allMatch(e -> e > 0);
        System.out.println(booleanResult2);

        var intStream1 = IntStream.of(1, 2, 3, 4, 5);
        var intStrResult1 = intStream1
                .filter(e -> e >= 3)
                .count();
        System.out.println(intStrResult1);

        var list12 = Stream.of(1, 2, 3);
        var list13 = Stream.of(4, 5, 6);
        Stream.concat(list12, list13).forEach(System.out::println);

        var longResult1 = LongStream.of(1L, 2L, 3L, 4L);
        var longResult2 = longResult1.sum();
        System.out.println(longResult2);

        var list14 = list11.stream()
                .skip(2)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(list14);

        List<String> list15 = new ArrayList<>();
        list15.add("apple");
        list15.add("bananas");
        list15.add("cherry");
        list15.add("date");
        list15.add("dat");
        list15.add("da");
        list15.add("d");

        HashMap<Integer, String> map = list15.stream()
                .limit(4)
                .skip(1)
                .collect(Collectors.toMap(
                        String::length,
                        s -> s,
                        (existingValue, newValue) -> existingValue,
                        HashMap::new
                ));

        System.out.println(map);

//        Step 4
        String str = (Math.random() > 0.5) ? "I'm feeling lucky" : null;
        Stream.ofNullable(str)
                .forEach(System.out::println);

        Stream.generate(() -> 60)
                .limit(6)
                .forEach(System.out::println);

        IntStream.range(0, 10)
                .limit(3)
                .forEach(System.out::println);
    }
}