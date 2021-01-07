package de.amore.david.adventofcode.day7;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Bagparser {
    public static List<Bag> parse(List<String> lines){
        return lines.stream().map(x->x.split(" contain ")).map(Bagparser::toBag).collect(Collectors.toList());
        //return null;
    }
    public static Bag toBag(String[] input){
        Bag b = new Bag();
        b.color= cleanUp(input[0]);
        b.contained =slitcontained(input[1]);
        return b;
    }

    private static List<Bag> slitcontained(String s) {
        List<Bag> res = new ArrayList<>();
        if("no other bags.".equals(s)){
            return res;
        }

        String[] bags =s.split(",");
        for (int i = 0; i < bags.length; i++) {
            String bag = bags[i];
            String[] split =bag.strip().split(" ",2);
            Integer amount =Integer.parseInt(split[0]);
            Bag b = new Bag();
            b.color = cleanUp(split[1]);
            b.amount = amount;
            res.add(b);
        }
        return res;
    }
    public static boolean find(List<Bag> allBags, Bag b, String color){
        boolean result =false;
        if(color.equals(b.color)){
                return true;
        }
            for(Bag bag :b.contained){
                Optional<Bag> found =allBags.stream().filter(x->bag.color.equals(x.color)).findFirst();

                if(found.isPresent()){

                    result = result | find(allBags,found.get() , color);
                }

            }


        return result;
    }
    public static int find2(List<Bag> allBags, Bag b){
        int result =1;
        result += allBags.stream().filter(x->x.color.equals(b.color)).findAny().get().amount;

        for (Bag bag : b.contained){
            Optional<Bag> found = allBags.stream().filter(x->bag.color.equals(x.color)).findFirst();
            result += bag.amount * find2(allBags,found.get());
        }
        return result;
    }
    private static String cleanUp(String s) {
        return s.replace("bags", "").replace("bag", "").replace(".", "").strip();
    }

}
