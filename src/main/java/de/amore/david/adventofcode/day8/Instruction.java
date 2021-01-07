package de.amore.david.adventofcode.day8;

import java.util.function.Function;

public class Instruction {
    public boolean executed = false;
    public String name;
    public Function<Computer,Void> doSth;
    public Function<Computer,Void> doSth2;
    public int value;
    boolean changed=false;

    @Override
    public String toString() {
        return "Instruction{" +
                "executed=" + executed +
                ", doSth=" + doSth +
                '}';
    }

    public void turnAround(){
        Function<Computer, Void> a = this.doSth;
        this.doSth = this.doSth2;
        this.doSth2 = a;
        this.changed = true;
    }
}
