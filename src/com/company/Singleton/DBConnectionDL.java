package com.company.Singleton;

// Double Locked
public class DBConnectionDL {
    private static DBConnectionDL dbConnectionDL;
    private DBConnectionDL() {}
    public static DBConnectionDL getInstance() {
        // here we don't make the method as synchronized
        // reason: assume a scenarios, where we have multiple threads parallely calling this method
        // if we have Synchronized method, our method will be locked if on thread calls, so everytime
        // lock will be acquired and then object will be return and then released
        // so we limit this behavior by only locking the block which is responsible for initializing object
        // otherwise if our object is already initialized we don't have to acquire lock
        if (dbConnectionDL == null) {
            synchronized (DBConnectionDL.class) {
                dbConnectionDL = new DBConnectionDL();
            }
        }
        return dbConnectionDL;
    }
}
