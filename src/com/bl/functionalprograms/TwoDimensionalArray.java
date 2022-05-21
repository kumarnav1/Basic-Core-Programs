package com.bl.functionalprograms;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionalArray {

    static final int FOR_INTEGER = 1;
    static final int FOR_DOUBLE = 2;
    static final int FOR_BOOLEAN = 3;
    static final int TERMINATION = 4;

    public static void main(String[] args) {

        int rows;
        int columns;

        AllInputOutput refVar = new AllInputOutput();
        Scanner choice = new Scanner(System.in);
        System.out.println(" \n Enter a number between 1 to 3 Only and Enter 4 to terminate from here");
        int choiceOfUsers = choice.nextInt();

        while ((choiceOfUsers <= 0 || choiceOfUsers > TERMINATION)) {
            System.out.println(" \n Please Enter a number between 1 to 3 Only and Enter 4 to terminate from here");
            choiceOfUsers = choice.nextInt();
        }

        while (choiceOfUsers > 0) {
            switch (choiceOfUsers) {
                case FOR_INTEGER:
                    int[][] arrayOfInt = refVar.takeInputIntArray();
                    rows = refVar.row;
                    columns = refVar.column;
                    refVar.printArrayOfInt(arrayOfInt, rows, columns);
                    System.out.println(" \n Enter 1 for Integer input, 2 for double and 3 for boolean or any other number to terminate.");
                    choiceOfUsers = choice.nextInt();
                    if ((choiceOfUsers < 0 || choiceOfUsers > 3)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case FOR_DOUBLE:
                    double[][] arrayOfDouble = refVar.takeInputDoubleArray();
                    rows = refVar.row;
                    columns = refVar.column;
                    refVar.printArrayOfDouble(arrayOfDouble, rows, columns);
                    System.out.println(" \n Enter 1 for Integer input, 2 for double and 3 for boolean or any other number to terminate");
                    choiceOfUsers = choice.nextInt();
                    if ((choiceOfUsers < 0 || choiceOfUsers > 3)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case FOR_BOOLEAN:
                    boolean[][] arrayOfBoolean = refVar.takeInputBooleans();
                    rows = refVar.row;
                    columns = refVar.column;
                    refVar.printArrayOfBooleans(arrayOfBoolean, rows, columns);
                    System.out.println(" \n Enter 1 for Integer input, 2 for double and 3 for boolean or any other number to terminate");
                    choiceOfUsers = choice.nextInt();
                    if ((choiceOfUsers < 0 || choiceOfUsers > 3)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case TERMINATION:
                    System.out.println("your program is terminated");
                    return;
            }
        }
    }
}

class AllInputOutput {

    int row;
    int column;

    int[][] arrayOfInt = new int[545][545];
    double[][] arrayOfDouble = new double[545][545];
    boolean[][] arrayOfBoolean = new boolean[2][2];
    Scanner refVarInput = new Scanner(System.in);

    public int[][] takeInputIntArray() {

        takesInputRowCol();

        for (int indexOfRow = 0; indexOfRow < row; indexOfRow++) {
            for (int indexOfColumn = 0; indexOfColumn < column; indexOfColumn++) {
                System.out.print("Enter the value of (" + indexOfRow + "," + indexOfColumn + ")th location : ");
                arrayOfInt[indexOfRow][indexOfColumn] = refVarInput.nextInt();
            }
        }
        return arrayOfInt;
    }

    public void printArrayOfInt(int[][] arrayInt, int row, int column) {

        OutputStreamWriter refOfKb = new OutputStreamWriter(System.out);
        PrintWriter refOfSt = new PrintWriter(refOfKb);

        refOfSt.println("\n\n Printing Your integer array : \n ");

        for (int indexOfRow = 0; indexOfRow < row; indexOfRow++) {
            for (int indexOfColumn = 0; indexOfColumn < column; indexOfColumn++) {
                refOfSt.print(arrayInt[indexOfRow][indexOfColumn] + "\t");
            }
            refOfSt.println();
        }
        refOfSt.flush();
    }


    public double[][] takeInputDoubleArray() {

        System.out.print("Enter the row number : ");
        row = refVarInput.nextInt();
        System.out.print("Enter the column number :");
        column = refVarInput.nextInt();

        for (int indexOfRow = 0; indexOfRow < row; indexOfRow++) {
            for (int indexOfColumn = 0; indexOfColumn < column; indexOfColumn++) {
                System.out.print("Enter the value of (" + indexOfRow + "," + indexOfColumn + ") location : ");
                arrayOfDouble[indexOfRow][indexOfColumn] = refVarInput.nextDouble();
            }
        }
        return arrayOfDouble;
    }

    public void printArrayOfDouble(double[][] arrayDouble, int row, int column) {

        OutputStreamWriter refOfKb = new OutputStreamWriter(System.out);
        PrintWriter refOfSt = new PrintWriter(refOfKb);

        refOfSt.println("\n\n Your double array : \n ");
        for (int indexOfRow = 0; indexOfRow < row; indexOfRow++) {
            for (int indexOfColumn = 0; indexOfColumn < column; indexOfColumn++) {
                refOfSt.print(arrayDouble[indexOfRow][indexOfColumn] + "\t");
            }
            refOfSt.println();
        }
        refOfSt.flush();
    }

    public boolean[][] takeInputBooleans() {

        takesInputRowCol();

        for (int indexOfRow = 0; indexOfRow < row; indexOfRow++) {
            for (int indexOfColumn = 0; indexOfColumn < column; indexOfColumn++) {
                System.out.print("Enter the value of (" + indexOfRow + "," + indexOfColumn + ") location : ");
                arrayOfBoolean[indexOfRow][indexOfColumn] = refVarInput.nextBoolean();
            }
        }
        return arrayOfBoolean;
    }

    public void printArrayOfBooleans(boolean[][] arrayBoolean, int row, int column) {

        OutputStreamWriter refOfKb = new OutputStreamWriter(System.out);
        PrintWriter refOfSt = new PrintWriter(refOfKb);

        refOfSt.println("\n\n Your integer array : \n ");
        for (int indexOfRow = 0; indexOfRow < row; indexOfRow++) {
            for (int indexOfColumn = 0; indexOfColumn < column; indexOfColumn++) {
                refOfSt.print(arrayBoolean[indexOfRow][indexOfColumn] + "\t");
            }
            refOfSt.println();
        }
        refOfSt.flush();
    }

    public void takesInputRowCol() {

        System.out.println("Enter your Array size.");
        System.out.print("Enter the row size : ");
        row = refVarInput.nextInt();
        System.out.print("Enter the column size :");
        column = refVarInput.nextInt();

    }
}
