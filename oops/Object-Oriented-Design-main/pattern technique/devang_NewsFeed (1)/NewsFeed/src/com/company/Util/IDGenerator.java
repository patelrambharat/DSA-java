package com.company.Util;

public class IDGenerator {
    private static int id = 1;

    public static int getId() {
        return id++;
    }
}
