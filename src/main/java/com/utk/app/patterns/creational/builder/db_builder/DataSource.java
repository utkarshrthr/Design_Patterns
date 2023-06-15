package com.utk.app.patterns.creational.builder.db_builder;

public class DataSource {

    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private DataSource(){

    }

    static class DataSourceBuilder {

        private static final DataSource dataSource = new DataSource();

        DataSource build(){
            return dataSource;
        }

        DataSourceBuilder username(String username){
            dataSource.username = username;
            return this;
        }

        DataSourceBuilder password(String password){
            dataSource.password = password;
            return this;
        }
    }
}
