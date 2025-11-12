package com.kajal.code.DSA.companies.Airtel;

public class Connection {
    static Connection instance = null;

    private Connection() {
    }


    public Connection getInstance() {
        if (instance != null) {
            return instance;
        } else {
            synchronized(Connection.class) {
                if (instance == null) {
                    instance = new Connection();
                }
                return instance;
            }
        }
    }
}