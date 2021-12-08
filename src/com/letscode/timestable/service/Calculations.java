package com.letscode.timestable.service;

public class Calculations {

    private static int ARRAY_LENGTH = 10;

    public static void setTimesTable(int number) {
        int[] timesTable = new int[ARRAY_LENGTH];

        for(int counter = 1; counter <= timesTable.length; counter++) {
            timesTable[counter-1] = counter * number;
        }

        System.out.printf("%s %8s\n", "Operation", "Result");

        for(int counter = 1; counter < timesTable.length; counter++) {
            System.out.printf("%5dx%d = %8d\n", counter, number, timesTable[counter-1]);
        }
    }
}
