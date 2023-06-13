package com.utk.app.patterns.structural.decorator.db_io;

public class DatabaseIOApp {

    public static void main(String[] args) {
        DatabaseIO databaseIO = new FileDatabaseIO();
        DatabaseIO encryptedDatabaseIO = new EncryptionDatabaseIODecorator(databaseIO);
        DatabaseIO CompressionDatabaseIO = new CompressionDatabaseIODecorator(databaseIO);
    }
}
