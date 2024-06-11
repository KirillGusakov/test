package org.example;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {


    public static void main(String args[]) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    public static List<List<Integer>> createTwoSetsOfEqualSum(int n) {
        // Divide the numbers 1,2,…,n into two sets of equal sum.

        // NOTE: If it's not possible, return an List of two empty Lists, i.e. [ [ ], [ ] ].
        // The code below does not do this, because it returns [ ].
        // You need to create the two sets/lists yourself, even if they are empty.


        final List<List<Integer>> sets = new ArrayList<>();



        double number = n;
        if(number / 2 % 1 != 0) {
            sets.add(new ArrayList<>());
            sets.add(new ArrayList<>());
            return sets;
        }

        List <Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            list.add(i);
        }




        return sets;
    }

    public static String highAndLow(String numbers) {
        List<Integer> list = Arrays.stream(numbers.split(" "))
                .map(Integer::parseInt)
                .sorted()
                .toList();

        return list.get(list.size() - 1) + " " + list.get(0);
        ///dasokpdkpaosdad
        /dada
    }

}

