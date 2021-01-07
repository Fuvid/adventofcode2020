package de.amore.david.adventofcode.day9;

import de.amore.david.adventofcode.util.Helper;

import java.io.IOException;
import java.time.YearMonth;
import java.util.List;
import java.util.stream.Collectors;

public class Day9 {
    public static void main(String[] args) throws IOException {
        List<Long> lines = Helper.listFromFile("Day9_input.txt").stream().map(Long::parseLong).collect(Collectors.toList());
        System.out.println(XMASValidator.parse(lines));
        System.out.println(XMASValidator.exploit(lines));
    }
}
