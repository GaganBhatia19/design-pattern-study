package com.company.Singleton;

public class DBConnectionSync {
    private static DBConnectionSync dbConnectionSync;

    private DBConnectionSync() {}

    synchronized public static DBConnectionSync getInstance() {
        /**
         * similar to Lazy initialization, but here we keep it synchronized
         * by this, if in multithreading env 2 thread running in parallel, try to access this method
         * it will be acquired by one thread, for the other this method will be locked until the first on completes it's task
         * */
        if (dbConnectionSync == null) {
            dbConnectionSync = new DBConnectionSync();
        }
        return dbConnectionSync;
    }
}
