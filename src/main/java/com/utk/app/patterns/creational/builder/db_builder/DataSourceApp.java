package com.utk.app.patterns.creational.builder.db_builder;

public class DataSourceApp {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource.DataSourceBuilder()
                .username("test user")
                .password("test@123")
                .build();

        System.out.println(dataSource.getUsername());
    }
}
