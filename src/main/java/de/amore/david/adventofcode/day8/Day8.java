package de.amore.david.adventofcode.day8;

import de.amore.david.adventofcode.util.Helper;

import java.io.IOException;
import java.util.List;

public class Day8 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Helper.listFromFile("Day8_input.txt");
        Computer c = new Computer();
        c.init(lines);
     System.out.println(c.compute());
        System.out.println(c.computeTwice());
    }
}
