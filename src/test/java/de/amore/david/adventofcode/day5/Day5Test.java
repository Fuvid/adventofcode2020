package de.amore.david.adventofcode.day5;

import org.junit.Assert;
import org.junit.Test;

public class Day5Test {
    @Test
    public void testRow(){
        Assert.assertEquals(44,SeatReader.getIntValue("FBFBBFF",'B','F'));
        Assert.assertEquals(70,SeatReader.getIntValue("BFFFBBF",'B','F'));
        Assert.assertEquals(14,SeatReader.getIntValue("FFFBBBF",'B','F'));
        Assert.assertEquals(102,SeatReader.getIntValue("BBFFBBF",'B','F'));
        Assert.assertEquals(7,SeatReader.getIntValue("RRR",'R','L'));
        Assert.assertEquals(5,SeatReader.getIntValue("RLR",'R','L'));
        Assert.assertEquals(4,SeatReader.getIntValue("RLL",'R','L'));
        Assert.assertEquals(567, SeatReader.toID("BFFFBBFRRR"));
        Assert.assertEquals(119, SeatReader.toID("FFFBBBFRRR"));
        Assert.assertEquals(820, SeatReader.toID("BBFFBBFRLL"));

    }
}
