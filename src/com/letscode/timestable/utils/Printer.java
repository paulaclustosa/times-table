package com.letscode.timestable.utils;

public class Printer {

    private static String WELCOME_MESSAGE = "Welcome to the multiplication tables program!";
    private static String ENTER_NUMBER_MESSAGE = "Which multiplication table would you like to see?";
    private static String ALERT_MESSAGE = "(please, enter an integer number between 1 and 10)";

    public static void printStartProgramMessages() {
        System.out.println(
                WELCOME_MESSAGE + "\n" +
                ENTER_NUMBER_MESSAGE + "\n" +
                ALERT_MESSAGE
        );
    }

}

