package de.amore.david.adventofcode.day5;

import de.amore.david.adventofcode.day10.JoltageFinder;
import de.amore.david.adventofcode.day9.XMASValidator;
import de.amore.david.adventofcode.util.Helper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Day10Test {
    @Test
    public void TestPart1() throws IOException {
        Helper.dir ="src/test/resources/";
        List<Long> lines =Helper.listFromFile("Day10_example.txt").stream().map(Long::parseLong).collect(Collectors.toList());
        XMASValidator.previous=5;
        Assert.assertEquals(220, JoltageFinder.find(lines));
    }
    @Test
    public void TestPart2() throws IOException {
        Helper.dir ="src/test/resources/";
        List<Long> lines =Helper.listFromFile("Day10_example.txt").stream().map(Long::parseLong).collect(Collectors.toList());
        XMASValidator.previous=5;
        Assert.assertEquals(19208, JoltageFinder.possibleArrangements(lines));
    }
}
