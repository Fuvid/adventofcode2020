package de.amore.david.adventofcode.day5;

import de.amore.david.adventofcode.day6.Answerhelper;
import de.amore.david.adventofcode.day7.Bag;
import de.amore.david.adventofcode.day7.Bagparser;
import de.amore.david.adventofcode.util.Helper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Day7Test {
    @Test
    public void testPart1() throws IOException {
        Helper.dir ="src/test/resources/";
        List<String> lines =Helper.listFromFile("Day7_example.txt");
        List<Bag> bags = Bagparser.parse(lines);


        Assert.assertEquals(4, bags.stream().map(x->Bagparser.find(bags,x,"shiny gold")).filter(x->x).count()-1);
        Bag shiny = bags.stream().filter(x->"shiny gold".equals(x.color)).findAny().get();

    }
    @Test
    public void testPart2() throws IOException {
        Helper.dir ="src/test/resources/";
        List<String> lines =Helper.listFromFile("Day7_example.txt");
        List<Bag> bags = Bagparser.parse(lines);
        Bag shiny = bags.stream().filter(x->"shiny gold".equals(x.color)).findAny().get();
        System.out.println(shiny);
        Assert.assertEquals(32, Bagparser.find2(bags,shiny)-1);
    }
}
