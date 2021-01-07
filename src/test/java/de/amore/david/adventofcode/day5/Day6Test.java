package de.amore.david.adventofcode.day5;

import de.amore.david.adventofcode.day6.Answerhelper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Day6Test {
    @Test
    public void testCharDistinct() throws IOException {
        Assert.assertEquals("abc",Answerhelper.distinctChar("aabbcc"));

        Assert.assertEquals("acb",Answerhelper.distinctChar("acabcbcabc"));
        Answerhelper.dir ="src/test/resources/";
        Assert.assertEquals(11L, (long)Answerhelper.splitGroups("Day6_example.txt").stream().map(Answerhelper::distinctChar).map(String::length).reduce((a, b) -> a + b).get());
        Assert.assertEquals(6L, (long)Answerhelper.splitGroups2("Day6_example.txt").stream().map(x->x.replace(" ","")).peek(System.out::println).map(String::length).reduce((a, b) -> a + b).get());
    }
}
