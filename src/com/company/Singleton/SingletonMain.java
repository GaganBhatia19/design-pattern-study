package com.company.Singleton;

public class SingletonMain {
    public static void run() {
        var dbconn = DBConnectionDL.getInstance();
        var dbconn2 = DBConnectionDL.getInstance();

        System.out.println(dbconn.equals(dbconn2));
    }
}
