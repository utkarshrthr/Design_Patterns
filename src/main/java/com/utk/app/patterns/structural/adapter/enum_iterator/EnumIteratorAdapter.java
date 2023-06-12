package com.utk.app.patterns.structural.adapter.enum_iterator;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumIteratorAdapter implements Iterator<String> {

    private Enumeration<String> enumeration;

    public EnumIteratorAdapter(Enumeration<String> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public String next() {
        return enumeration.nextElement();
    }
}
