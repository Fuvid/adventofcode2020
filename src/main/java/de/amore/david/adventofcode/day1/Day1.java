package de.amore.david.adventofcode.day1;

import de.amore.david.adventofcode.util.Helper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Day1 {
    public static void main(String[] args) throws IOException {

        List<String> rows = Helper.listFromFile("Day1_input.txt");
        List<Integer> numbers = rows.stream().map(x -> Integer.valueOf(x)).collect(Collectors.toList());

        int first = numbers.stream().map(x ->
            numbers.stream().filter(y -> (y + x) == 2020).findAny().orElseGet(() -> 0) * x
        ).filter(x -> x != 0).findFirst().get();
        System.out.println(first);

        for (int i = 0; i <= numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                for (int k = j + 1; k < numbers.size(); k++) {
                    if (numbers.get(i) + numbers.get(j) + numbers.get(k) == 2020) {
                        System.out.println(numbers.get(i) * numbers.get(j) * numbers.get(k));
                    }
                }
            }
        }
    }

}
