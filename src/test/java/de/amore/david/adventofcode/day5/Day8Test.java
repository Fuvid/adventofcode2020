package de.amore.david.adventofcode.day5;

import de.amore.david.adventofcode.day7.Bag;
import de.amore.david.adventofcode.day7.Bagparser;
import de.amore.david.adventofcode.day8.Computer;
import de.amore.david.adventofcode.util.Helper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Day8Test {
    @Test
    public void testPart1() throws IOException {
        Helper.dir ="src/test/resources/";
        List<String> lines =Helper.listFromFile("Day8_example.txt");
        Computer c = new Computer();
        c.init(lines);
        Assert.assertEquals(5, c.compute());

    }
    @Test
    public void testPart2() throws IOException {
        Helper.dir ="src/test/resources/";
        List<String> lines =Helper.listFromFile("Day8_example.txt");
        Computer c = new Computer();
        c.init(lines);
        Assert.assertEquals(8, c.computeTwice());

    }
}
