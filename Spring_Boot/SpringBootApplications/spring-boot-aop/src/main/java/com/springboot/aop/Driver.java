package com.springboot.aop;

import java.util.Vector;

public class Driver {
    private StringContainer b = null;

    public static void main(String[] args) {
        Driver d = new Driver();
        d.run();
    }


    public void run() {
        b = new StringContainer();
        b.add("One");
        b.add("Two");
        b.remove("One");
    }
}

class StringContainer {
    private Vector v = null;

    public void add(String s) {
        init();
        v.add(s);
    }


    public void remove(String s) {
        init();
        v.remove(s);
    }


    public void init() {
        if (v == null) v = new Vector();
    }
}
