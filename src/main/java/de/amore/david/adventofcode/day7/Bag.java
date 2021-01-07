package de.amore.david.adventofcode.day7;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bag {
    public String color;
    public List<Bag> contained= new ArrayList<>();
    public int amount;
    @Override
    public String toString() {
        return "Bag{" +
                "color='" + color + '\'' +
                ", contained=" + contained +
                ", amount=" + amount +
                '}';
    }

    public  String getColor() {
        return color;
    }
}
