package de.amore.david.adventofcode.day8;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Computer {
    List<Instruction> inst;
    int acc;
    int exe;
    public void init(List<String> instructions){
        this.inst = instructions.stream().map(InstructionParser::parse).collect(Collectors.toList());
        acc = 0;
        exe =0;
    }
    public int compute(){
        Instruction i = inst.get(exe++);
        while(!i.executed){
            i.doSth.apply(this);
            i.executed=true;
            i= inst.get(exe++);
        }

        return acc;
    }
    public int computeTwice(){
        for (Instruction i : inst) {
            if("acc".equals(i.name)){
                continue;
            }
            i.turnAround();
            Instruction instr = inst.get(exe++);
            while(!instr.executed){
                instr.doSth.apply(this);
               instr.executed=true;
                if(exe >= inst.size() ){
                    return acc;
                }
                instr = inst.get(exe++);
            }
            i.turnAround();
            reset();
        }
        return acc;
    }
    public void reset(){
        acc = 0;
        exe = 0;
        for (Instruction i : inst) {
            i.executed = false;
        }

    }

    @Override
    public String toString() {
        return "Computer{" +
                "inst=" + inst +
                ", acc=" + acc +
                ", exe=" + exe +
                '}';
    }
}
