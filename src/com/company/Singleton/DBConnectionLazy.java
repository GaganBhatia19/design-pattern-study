package com.company.Singleton;

public class DBConnectionLazy {

    private static DBConnectionLazy dbConnectionLazy;
    private DBConnectionLazy() {} // private constructor

    public static DBConnectionLazy getInstance() {
        if (dbConnectionLazy == null) { // syntax for lazy initialization
            dbConnectionLazy = new DBConnectionLazy();
        }
        return dbConnectionLazy;
    }
}
