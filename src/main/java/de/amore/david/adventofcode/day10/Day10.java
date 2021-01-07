package de.amore.david.adventofcode.day10;

import de.amore.david.adventofcode.day9.XMASValidator;
import de.amore.david.adventofcode.util.Helper;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Day10 {
    public static void main(String[] args) throws IOException {
        List<Long> lines = Helper.listFromFile("Day10_input.txt").stream().map(Long::parseLong).collect(Collectors.toList());
        System.out.println(JoltageFinder.find(lines));
    }
}
