package com.letscode.timestable.utils;

import java.util.Scanner;

public class Reader {

    private static Scanner numberScan = new Scanner(System.in);

    public static int getNumber() {
        Printer.printStartProgramMessages();
        return numberScan.nextInt();
    }

}
