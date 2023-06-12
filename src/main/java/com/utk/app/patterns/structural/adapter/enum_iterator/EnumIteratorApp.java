package com.utk.app.patterns.structural.adapter.enum_iterator;

import java.util.Enumeration;

public class EnumIteratorApp {

    public static void iterate(){
        Enumeration<String> enumeration = new EnumerationProducer().getEnumeration();

        EnumIteratorAdapter adapter = new EnumIteratorAdapter(enumeration);

        IteratorConsumer consumer = new IteratorConsumer(adapter);

        consumer.loop();
    }

    public static void main(String[] args) {
        iterate();
    }
}
