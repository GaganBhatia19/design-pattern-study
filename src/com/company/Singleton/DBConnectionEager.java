package com.company.Singleton;

// Eager
public class DBConnectionEager {
    private static DBConnectionEager dbConnectionEager = new DBConnectionEager();
    private DBConnectionEager() {} // private constructor
    public static DBConnectionEager getInstance() {
        return dbConnectionEager;
    }
}
