package com.utk.app.patterns.structural.adapter.enum_iterator;

import java.util.Iterator;

public class IteratorConsumer {

    private Iterator<String> iterator;

    public IteratorConsumer(Iterator<String> iterator) {
        this.iterator = iterator;
    }

    public void loop(){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
