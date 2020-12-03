package de.amore.david.adventofcode.day2;

public class Password {
    Condition con;
    String pass;

    public Password(Condition con, String pass) {
        this.con = con;
        this.pass = pass;
    }

    boolean isValid() {
        return con.check(pass);
    }

    boolean isValid2() {
        return con.check2(pass);
    }
}
