package de.amore.david.adventofcode.day7;

import de.amore.david.adventofcode.util.Helper;

import java.io.IOException;
import java.util.List;

public class Day7 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Helper.listFromFile("Day7_input.txt");
        List<Bag> bags = Bagparser.parse(lines);
        long count =  bags.stream().map(x->Bagparser.find(bags,x,"shiny gold")).filter(x->x).count();
        System.out.println(count-1);

        Bag shiny = bags.stream().filter(x->"shiny gold".equals(x.color)).findAny().get();
        System.out.println(shiny);
        System.out.println(Bagparser.find2(bags, shiny)-1);
    }
}
