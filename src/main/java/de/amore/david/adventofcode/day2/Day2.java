package de.amore.david.adventofcode.day2;

import de.amore.david.adventofcode.util.Helper;

import java.io.IOException;
import java.util.List;

public class Day2 {
    public static void main(String[] args) throws IOException {
        List<String> list = Helper.listFromFile("Day2_input.txt");
        long count = list.stream().map(Day2::mapStringToPass).filter(x -> x.isValid()).count();
        System.out.println(count);
        count = list.stream().map(Day2::mapStringToPass).filter(x -> x.isValid2()).count();
        System.out.println(count);
    }

    static Password mapStringToPass(String s) {
        String[] line = s.split(" ", 0);
        String[] minMax = line[0].split("-", 0);
        int min = Integer.valueOf(minMax[0]);
        int max = Integer.valueOf(minMax[1]);
        char c = line[1].charAt(0);
        Condition condition = new Condition(min, max, c);
        return new Password(condition, line[2]);
    }


}
