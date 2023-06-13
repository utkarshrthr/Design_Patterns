package com.utk.app.patterns.structural.decorator.db_io;

public class CompressionDatabaseIODecorator extends BaseDatabaseIODecorator {

    public CompressionDatabaseIODecorator(DatabaseIO databaseIO) {
        super(databaseIO);
    }

    @Override
    public String read(String key) {
        String value = databaseIO.read(key);
        return DatabaseIOUtils.decompress(value);
    }

    @Override
    public void write(String key, String value) {
        String decompressedVal = DatabaseIOUtils.compress(value);
        databaseIO.write(key, decompressedVal);
    }
}
