package com.utk.app.patterns.structural.decorator.db_io;

public abstract class BaseDatabaseIODecorator implements DatabaseIO {

    protected DatabaseIO databaseIO;

    public BaseDatabaseIODecorator(DatabaseIO databaseIO) {
        this.databaseIO = databaseIO;
    }


}
