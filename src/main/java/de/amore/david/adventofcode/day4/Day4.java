package de.amore.david.adventofcode.day4;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Day4 {
    public static void main(String[] args) {
        List<String> required = new ArrayList<>();
        required.add("byr");
        required.add("iyr");
        required.add("eyr");
        required.add("hgt");
        required.add("hcl");
        required.add("ecl");
        required.add("pid");
        //required.add("cid");

        Reader r = new Reader();
        List<Map<String, String>> persos = r.read("Day4_input.txt");

        long result = persos.stream().filter(x -> required.stream().map(req -> x.containsKey(req)).reduce((a, b) -> a && b).get()).count();
        System.out.println(result); // part 1
        System.out.println(NumberUtils.isCreatable("072379782")); // part 1
        Map<String, Function<String, Boolean>> conditions = new HashMap<>();
        conditions.put("byr", (String x) -> ((x.length() == 4) && (1920 <= Integer.valueOf(x)) && (Integer.valueOf(x) <= 2002)));
        conditions.put("iyr", (String x) -> ((x.length() == 4) && (2010 <= Integer.valueOf(x)) && (Integer.valueOf(x) <= 2020)));
        conditions.put("eyr", (String x) -> ((x.length() == 4) && (2020 <= Integer.valueOf(x)) && (Integer.valueOf(x) <= 2030)));
        conditions.put("hgt", (String x) -> checkheight(x));
        conditions.put("hcl", (String x) -> x.length() == 7 && x.matches("#[0-9,a-f]{6}"));
        conditions.put("ecl", (String x) -> Arrays.asList("amb", "blu", "brn", "gry", "grn", "hzl", "oth").contains(x.trim().toLowerCase()));
        conditions.put("pid", (String x) -> NumberUtils.isCreatable(x) && x.length() == 9);
        result = persos.stream().filter(x -> conditions.entrySet().stream().map(cond -> x.containsKey(cond.getKey())&&cond.getValue().apply(x.get(cond.getKey()))).reduce((a, b) -> a && b).get()).count();
        System.out.println(result);//part 2 (not working) should return 140 but does 127
    }

    private static boolean checkheight(String x) {
        if(x.endsWith("cm")){
            int size = Integer.valueOf(x.substring(0,x.indexOf("cm")));
                    return size >=150 && size<=193;
        }else if(x.endsWith("in")){
            int size = Integer.valueOf(x.substring(0,x.indexOf("in")));
            return size >=59 && size<=76;
        }
        return false;

    }
}
