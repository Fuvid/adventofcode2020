package de.amore.david.adventofcode.day2;

public class Condition {

    int min;
    int max;
    char aChar;
    public Condition(int min , int max, char c){
        this.min= min;
        this.max = max;
        this.aChar = c;
    }
    public boolean check(String s){
        long count = s.chars().filter(ch -> ch == aChar).count();
        return count>=min&&count<=max;
    }
    public boolean check2(String s){
        return s.charAt(min-1)==aChar^s.charAt(max-1)==aChar;
    }
}
