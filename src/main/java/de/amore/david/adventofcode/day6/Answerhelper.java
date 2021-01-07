package de.amore.david.adventofcode.day6;


import com.google.common.base.Strings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Answerhelper {
    public static String dir ="src/main/resources/";
    public static List<String> splitGroups(String filename) throws IOException {

            File f = new File(dir+filename);
            BufferedReader br = new BufferedReader(new FileReader(f));
            List<String> list=new ArrayList<>();
            String line;
            StringBuffer sb = new StringBuffer();
            while ((line = br.readLine()) != null) {
                if(Strings.isNullOrEmpty(line)){
                    list.add(sb.toString());
                    sb = new StringBuffer();
                    continue;
                }
                sb.append(line);
            }
            list.add(sb.toString());
            return list;

    }
    public static List<String> splitGroups2(String filename) throws IOException {

        File f = new File(dir+filename);
        BufferedReader br = new BufferedReader(new FileReader(f));
        List<String> list=new ArrayList<>();
        String line;
        String answers = "";
        boolean next = true;
        while ((line = br.readLine()) != null) {
            if(Strings.isNullOrEmpty(line)){
                list.add(answers.strip());
                next = true;
                continue;
            }
            if(next){
                answers = line;
                next = false;
            }


            for(char c:answers.toCharArray()){
                if(!line.contains(Character.toString(c))){
                    answers = answers.replace(c+"", "");
                }
            }


        }
        list.add(answers.strip());

        return list;

    }
    public static String distinctChar(String str){
        return str.chars().distinct().collect(StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append).toString();
    }
}
