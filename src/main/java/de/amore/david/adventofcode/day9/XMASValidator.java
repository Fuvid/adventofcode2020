package de.amore.david.adventofcode.day9;

import java.util.List;

public class XMASValidator {
    public static int previous = 25;
    public static long parse(List<Long> input){
        for (int i = previous+1; i < input.size(); i++) {
            boolean valid = validate(input.get(i),input.subList(i-previous-1,i));
            if(!valid){
                return input.get(i);
            }
        }
        return -1;
    }
    public static long exploit(List<Long> input){
        for (int i = previous+1; i < input.size(); i++) {
            long in= input.get(i);
            List<Long> subList = input.subList(i - previous - 1, i);
            boolean valid = validate(in,subList);
            if(!valid){
                List<Long> subList2 = input.subList(0, i);
                for (int j = 0; j < subList2.size(); j++) {
                    long sum=0;
                    int k = j;
                    while(sum<=in){
                        sum+=subList2.get(k++);
                        if (sum==in){
                            return subList2.subList(j,k).stream().max(Long::compareTo).get()+subList2.subList(j,k).stream().min(Long::compareTo).get();
                        }
                    }
                    System.out.println(sum+">"+in);
                }
            }
        }
        return -1;
    }
    private static  boolean validate(Long integer, List<Long> subList) {
              for (int i = 0; i < subList.size(); i++) {
            long a = subList.get(i);
            for (int j = i+1; j < subList.size(); j++) {
                long b= subList.get(j);
                if(a+b == integer){
                    //System.out.println(a+"+"+b+"=="+integer);
                    return true;
                }
            }
        }
        System.out.println(subList+""+integer);
        return false;
    }
}
