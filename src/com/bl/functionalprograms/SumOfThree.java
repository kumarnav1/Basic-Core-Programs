package com.bl.functionalprograms;

import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {

        int[][][] arrayInput = new int[454][454][454];
        int row;
        int column;
        int block;

        Scanner refVarInput = new Scanner(System.in);
        System.out.println("Enter your Array size.");
        System.out.print("Enter the row size : ");
        row = refVarInput.nextInt();
        System.out.print("Enter the column size :");
        column = refVarInput.nextInt();
        System.out.print("Enter the inside size :");
        block = refVarInput.nextInt();

        for (int indexOfRow = 0; indexOfRow < row; indexOfRow++) {
            for (int indexOfColumn = 0; indexOfColumn < column; indexOfColumn++) {
                for (int indexOfInside = 0; indexOfInside < block; indexOfInside++) {
                    System.out.print("Enter the value of (" + indexOfRow + "," + indexOfColumn + "," + indexOfInside + ")th location : ");
                    arrayInput[indexOfRow][indexOfColumn][indexOfInside] = refVarInput.nextInt();
                }
            }

            for (int indexOfRows = 0; indexOfRows < row; indexOfRows++) {
                for (int indexOfColumn = 0; indexOfColumn < column; indexOfColumn++) {
                    for (int indexOfInside = 0; indexOfInside < block; indexOfInside++) {
                        int sum = arrayInput[indexOfRow][indexOfColumn][indexOfInside] + arrayInput[indexOfRow][indexOfColumn][indexOfInside + 1] + arrayInput[indexOfRow][indexOfColumn + 1][indexOfInside + 2] + arrayInput[indexOfRows][indexOfColumn + 2][indexOfInside + 3];
                        if (sum == 0) {
                            System.out.println(arrayInput[indexOfRow][indexOfColumn][indexOfInside] + "," + arrayInput[indexOfRow][indexOfColumn][indexOfInside + 1] + "," + arrayInput[indexOfRows][indexOfColumn + 2][indexOfInside + 3]);
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}

