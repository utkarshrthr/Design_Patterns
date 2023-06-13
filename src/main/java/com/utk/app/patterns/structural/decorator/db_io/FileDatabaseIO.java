package com.utk.app.patterns.structural.decorator.db_io;

public class FileDatabaseIO implements DatabaseIO {

    private DatabaseStorage storage = new DatabaseStorage();

    @Override
    public String read(String key) {
        return storage.read(key);
    }

    @Override
    public void write(String key, String value) {
        storage.write(key, value);
    }
}
