package de.amore.david.adventofcode.day6;

import java.io.IOException;
import java.util.Optional;

public class Day6 {
    public static void main(String[] args) throws IOException {
        Integer count = Answerhelper.splitGroups("Day6_input.txt").stream().map(Answerhelper::distinctChar).map(String::length).reduce((a, b) -> a + b).get();
        System.out.println(count);
        int part2= Answerhelper.splitGroups2("Day6_input.txt").stream().map(x->x.replace(" ","")).peek(System.out::println).map(String::length).reduce((a, b) -> a + b).get();
        System.out.println(part2);
    }
}
