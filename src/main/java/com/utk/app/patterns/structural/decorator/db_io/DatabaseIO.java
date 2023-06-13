package com.utk.app.patterns.structural.decorator.db_io;

public interface DatabaseIO {

    String read(String key);
    void write(String key, String value);
}
