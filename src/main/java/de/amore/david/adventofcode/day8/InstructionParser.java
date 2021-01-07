package de.amore.david.adventofcode.day8;

import java.util.function.Function;

public class InstructionParser {
    public static Instruction parse(String inst){
        Instruction in = new Instruction();
        if(inst.startsWith("nop")){
            int value = Integer.parseInt(inst.split( " " )[1].replace("+",""));
            in.name = "nop";
            in.doSth = x->{
                return null;
            };
            in.doSth2 = x->{
                x.exe+= value-1;
                return null;
            };
            in.value = value;
        }else
        if(inst.startsWith("acc")){
            int value = Integer.parseInt(inst.split( " " )[1].replace("+",""));
            in.name = "acc";
            in.doSth = x->{
                x.acc +=value;
                return null;
            };
            in.value = value;
        }else
        if(inst.startsWith("jmp")){
            in.name = "jmp";
            int value = Integer.parseInt(inst.split( " " )[1].replace("+",""));
            in.doSth = x->{
                x.exe += value-1;
                return null;
            };
            in.doSth2 = x->{
                return null;
            };
            in.value = value;
        }
        //System.out.println(in);
        return in;
    }
}
