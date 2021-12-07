package com.letscode.timestable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner numberScan = new Scanner(System.in);

        System.out.println("Welcome to the multiplication tables program!");
        System.out.println("Which multiplication table would you like to see?");
        System.out.println("(please, enter an integer number between 1 and 10)");

        int number = numberScan.nextInt();

        findTimesTable(number);

    }

    public static void findTimesTable (int number) {

        int lineOne = number * 1;
        int lineTwo = number * 2;
        int lineThree = number * 3;
        int lineFour = number * 4;
        int lineFive = number * 5;
        int lineSix = number * 6;
        int lineSeven = number * 7;
        int lineEight = number * 8;
        int lineNine = number * 9;
        int lineTen = number * 10;

        System.out.print(
                "1x" + number + " = " + lineOne + "\n" +
                "2x" + number + " = " + lineTwo + "\n" +
                "3x" + number + " = " + lineThree + "\n" +
                "4x" + number + " = " + lineFour + "\n" +
                "5x" + number + " = " + lineFive + "\n" +
                "6x" + number + " = " + lineSix + "\n" +
                "7x" + number + " = " + lineSeven + "\n" +
                "8x" + number + " = " + lineEight + "\n" +
                "9x" + number + " = " + lineNine + "\n" +
                "10x" + number + " = " + lineTen
        );
    }
}
