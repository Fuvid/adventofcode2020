package de.amore.david.adventofcode.day5;

import com.google.common.base.Strings;
import de.amore.david.adventofcode.util.Helper;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day5 {
    public static void main(String[] args) throws IOException {
        int max =Helper.listFromFile("Day5_input.txt").stream().map(SeatReader::toID).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        for(int i =0;i<896;i++){
            int j=i-1;
            List<String> seats = Helper.listFromFile("Day5_input.txt").stream().map(SeatReader::toBinaryString).collect(Collectors.toList());
            String seat = Integer.toBinaryString(i);
            String seatBefore = Integer.toBinaryString(j);
            if(!seats.contains(Strings.padStart(seat, 10, '0'))&&seats.contains(Strings.padStart(seatBefore, 10, '0'))){
                System.out.println(Integer.valueOf(seat,2));
            }

        }
    }
}
