package com.utk.app.patterns.structural.decorator.db_io;

import java.util.HashMap;
import java.util.Map;

public class DatabaseStorage {

    private final Map<String, String> storage = new HashMap<>();

    public final void write(String key, String value){
        storage.put(key, value);
    }

    public final String read(String key){
        return storage.get(key);
    }
}
