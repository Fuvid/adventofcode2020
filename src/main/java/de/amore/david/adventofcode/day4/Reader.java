package de.amore.david.adventofcode.day4;

import de.amore.david.adventofcode.util.Pair;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.base.Strings;

public class Reader {
    public List<Map<String, String>> read(String filename) {
        List<Map<String, String>> res = new ArrayList<>();
        File f = new File("src/main/resources/" + filename);
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line = "";
            Map<String, String> perso = new HashMap<>();
            while ((line = br.readLine()) != null) {
                if (Strings.isNullOrEmpty(line)) {
                    res.add(perso);
                    perso = new HashMap<>();
                    continue;
                }
                String[] entries = line.split(" ");
                perso.putAll(Stream.of(entries).map(x -> {
                            //System.out.println(x);
                            String[] kv = x.split(":");
                            return new Pair<String,String>(kv[0], kv[1]);
                        }).collect(Collectors.toMap(x -> x.getA(), y -> y.getB()))
                );
            }
            res.add(perso);

            return res;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}
