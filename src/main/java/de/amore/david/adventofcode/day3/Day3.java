package de.amore.david.adventofcode.day3;

import de.amore.david.adventofcode.util.Helper;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Day3 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Helper.listFromFile("Day3_input.txt");
        List<char[]> trees = lines.stream().map(x -> x.toCharArray()).collect(Collectors.toList());
        System.out.println(count(3, 1, trees)); //part1
        int total = 1;
        total *= count(1, 1, trees);
        total *= count(3, 1, trees);
        total *= count(5, 1, trees);
        total *= count(7, 1, trees);
        total *= count(1, 2, trees);
        //System.out.println(count(1, 2, trees));
        System.out.println(total);//part2
    }

    public static int count(int slopex, int slopey, List<char[]> trees) {
        int rowLength = trees.get(0).length;
        int treeCount = 0;

        int x = 0;
        int y = 0;

        while (y < trees.size()) {
            if (trees.get(y)[x] == '#') {
                treeCount++;
            }
            x += slopex;
            x = x % rowLength;
            y += slopey;
        }
        return treeCount;
    }
}
