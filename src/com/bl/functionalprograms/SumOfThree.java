package com.bl.functionalprograms;

import java.util.Scanner;

public class SumOfThree {

    public static void main(String[] args) {

        System.out.println("Enter your Array size.");

        Scanner refVarInput = new Scanner(System.in);
        int arraySize = refVarInput.nextInt();
        int[] arrayInput = new int[arraySize];
        int countTriplets = 0;

        for (int index = 0; index < arraySize; index++) {
            System.out.print("Enter thw element at location of array: [" + index + "] : ");
            arrayInput[index] = refVarInput.nextInt();
        }

        for (int IndexI = 0; IndexI < arraySize - 2; IndexI++) {
            for (int indexJ = IndexI + 1; indexJ < arraySize - 1; indexJ++) {
                for (int indexK = indexJ + 1; indexK < arraySize; indexK++) {
                    int sum = arrayInput[IndexI] + arrayInput[indexJ] + arrayInput[indexK];
                    if (sum == 0) {
                        ++countTriplets;
                        System.out.println("\n \t " + arrayInput[IndexI] + "\t" + arrayInput[indexJ] + "\t" + arrayInput[indexK]);
                    }
                }
            }
        }
        if (countTriplets == 0)
            System.out.println(" \n No distinct triplets found in the array");
        else
            System.out.println(" Total number of Distinct triplets in the array : " + countTriplets);
    }
}