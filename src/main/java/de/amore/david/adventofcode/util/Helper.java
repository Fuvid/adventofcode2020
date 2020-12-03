package de.amore.david.adventofcode.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Helper<T> {
    public static List<String> listFromFile(String filename) throws IOException {
        File f = new File("src/main/resources/"+filename);
        BufferedReader br = new BufferedReader(new FileReader(f));
        List<String> list=new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        return list;
    }

}
