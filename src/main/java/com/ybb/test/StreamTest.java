package com.ybb.test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        /*list.forEach(System.out::println);*/
        /*IntStream.of(1,2,3).forEach(System.out::println);*/
        /*IntStream.rangeClosed(1,5).forEach(System.out::println);*/
        /*list.stream().map(x -> x*x).forEach(System.out::println);*/
        /*System.out.println(Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min));*/
        /*System.out.println(Stream.of(1, 2, 3, 4).reduce(Integer::sum).get());*/
        Random random = new Random();
        Stream.generate(() -> random.nextInt(10)).limit(10).forEach((x) -> System.out.print(x+" "));
        Stream.iterate(0,(n) -> n+random.nextInt(10)).limit(10).forEach((x) -> System.out.print(x+" "));
//        list.stream()
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String G7Countries = G7.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concat);
        System.out.println(G7Countries);
    }
}
