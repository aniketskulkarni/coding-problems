package com.practice.problemsolving.algorithm.implementation.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticks {

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> sticks = new ArrayList<>();

        /*
         * int min = arr.stream()
         * .mapToInt(num -> num)
         * .min()
         * .getAsInt();
         */

        while (arr.size() != 0) {
            sticks.add(arr.size());

            int min = arr.stream()
                    .min(Integer::compare)
                    .get();

            arr = arr.stream()
                    .map(num -> num - min)
                    .filter(num -> num != 0)
                    .collect(Collectors.toList());

        }
        return sticks;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5, 4, 4, 2, 2, 8);
        for (Integer integer : cutTheSticks(arr)) {
            System.out.println(integer);
        }
    }
}
