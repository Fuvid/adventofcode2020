package de.amore.david.adventofcode.day5;

import de.amore.david.adventofcode.day9.XMASValidator;
import de.amore.david.adventofcode.util.Helper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Day9Test {
    @Test
    public void testPart1() throws IOException {
        Helper.dir ="src/test/resources/";
        List<Long> lines =Helper.listFromFile("Day9_example.txt").stream().map(Long::parseLong).collect(Collectors.toList());
        XMASValidator.previous=5;
        Assert.assertEquals(127, XMASValidator.parse(lines));
    }
    @Test
    public void testPart2() throws IOException {
        Helper.dir ="src/test/resources/";
        List<Long> lines =Helper.listFromFile("Day9_example.txt").stream().map(Long::parseLong).collect(Collectors.toList());
        XMASValidator.previous=5;
        Assert.assertEquals(62, XMASValidator.exploit(lines));
    }
}
