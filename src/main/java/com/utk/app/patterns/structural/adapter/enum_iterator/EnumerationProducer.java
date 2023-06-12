package com.utk.app.patterns.structural.adapter.enum_iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationProducer {

    private final Vector<String> values = new Vector<>();

    public EnumerationProducer(){
        values.add("One");
        values.add("Two");
        values.add("Three");
        values.add("Four");
        values.add("Five");
    }

    public Enumeration<String> getEnumeration(){
        return values.elements();
    }
}
