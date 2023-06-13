package com.utk.app.patterns.structural.decorator.db_io;

public class EncryptionDatabaseIODecorator extends BaseDatabaseIODecorator {

    public EncryptionDatabaseIODecorator(DatabaseIO databaseIO) {
        super(databaseIO);
    }

    @Override
    public String read(String key) {
        String value = databaseIO.read(key);
        return DatabaseIOUtils.decrypt(value);
    }

    @Override
    public void write(String key, String value) {
        String decompressedVal = DatabaseIOUtils.encrypt(value);
        databaseIO.write(key, decompressedVal);
    }
}
