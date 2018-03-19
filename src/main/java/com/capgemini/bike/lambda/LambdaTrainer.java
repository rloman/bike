package com.capgemini.bike.lambda;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaTrainer {

    public static void main(String[] args) {


        //oca Predicate ... die ga ik nu laten zien


        List<Integer> result = new ArrayList<>();

        List<Integer> numberList = Arrays.asList(0, 13, 21, 34, 1, 3, 5, 1, 3, 8, 55, 89);

        for (int element : numberList) {

            if (element % 2 == 0) {
                result.add(element);
            }

        }

        System.out.println(result);

        // since Java8

        numberList.stream().filter(n -> n % 2 == 0).forEach(e -> {
            System.out.println(e);
        });


        numberList.stream().filter(koekjes -> koekjes % 2 == 0).map(t -> t * t).forEach(koekjes -> {
            System.out.println(koekjes);
        });


        System.out.println("Sorted");
        numberList.stream().filter(n -> n % 2 == 1).map(n -> 2 * n).sorted().forEach(n -> {
            System.out.println(n);
        });

        System.out.println("Ontdubbeld and sorted");
        numberList.stream().distinct().sorted().forEach(n -> {
            System.out.println(n);
        });

        numberList = numberList.stream().distinct().sorted().collect(Collectors.toList());

        System.out.println("Nu heb ik de lijst zelf aangepast via assignment");

        System.out.println(numberList);

        numberList.stream().peek(n -> {
            System.out.println("Tussentijds heb ik ... " + n);

        }).filter(n -> n % 2 == 0).forEach(n -> {
            System.out.println(n);


        });


        numberList.stream().filter(n -> n %3 == 0).map(n -> n * n).peek(n -> {
            System.out.println("In de peek van de non terminal");

            return;
        });

        long aantal = numberList.stream().filter(n -> n >3).count();

        int sum = numberList.stream().mapToInt(n -> n).sum();

        System.out.println("som is: "+sum);



    }
}

@FunctionalInterface
interface MyTrait <T> {

    boolean test(T t);

}

class MyPredicate implements Predicate <Integer> {

    private int n;

    public MyPredicate(int n ) {
        this.n = n;
    }

    @Override
    public boolean test(Integer integer) {
        return integer > n;
    }
}
