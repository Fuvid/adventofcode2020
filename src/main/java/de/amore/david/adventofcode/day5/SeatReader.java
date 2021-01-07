package de.amore.david.adventofcode.day5;

public class SeatReader {

    public static int  toID(String boardingpass){

        //int row = getIntValue(boardingpass.substring(0,7),'B','F');
        //int column = getIntValue(boardingpass.substring(7,10),'R','L');
        return Integer.parseInt(toBinaryString(boardingpass),2);
    }
    public static String toBinaryString(String pass){
        String res = pass;
        res =res.replace('F','0').replace('B','1');
        res =res.replace('L','0').replace('R','1');
        return res;
    }
    public static int getIntValue(String rowId, char upper, char lower){
        return Integer.parseInt(rowId.replace(lower,'0').replace(upper,'1'), 2);
    }
}
