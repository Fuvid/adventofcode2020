package de.amore.david.adventofcode.day10;

import java.util.List;
import java.util.stream.LongStream;

public class JoltageFinder {

    public static long find(List<Long> lines) {
        lines.sort(Long::compareTo);
        int oneJolt =1;
        int threeJolt =1;
        for (int i = 0; i < lines.size()-1; i++) {
            long a = lines.get(i);
            long b = lines.get(i+1);
            if (b-a ==1){
                oneJolt++;
            }
            if (b-a ==3){
                threeJolt++;
            }
        }
        return oneJolt*threeJolt;
    }
    public static long possibleArrangements(List<Long> lines){
        lines.add(0L);
        lines.add(lines.stream().max(Long::compareTo).get()+3);

        lines.sort(Long::compareTo);
        long possibilities=1;

        for (int i = 0; i < lines.size(); i++){
            if(i-1>=0 && i+1 <lines.size()){
                long before = lines.get(i-1);
                long after = lines.get(i+1);
                if (after-before<=3){
                    possibilities *=2;
                }
            }

        }
        System.out.println("POS:"+possibilities);
       // System.out.println(LongStream.rangeClosed(lines.size(), possibilities)
        //        .reduce(1, (long x, long y) -> x * y));

        return 0;
    }
}
