package com.bl.basiccoreprograms;

import java.util.Scanner;

public class BasicCorePrograms {

    static final int PROGRAM_ONE = 1;
    static final int PROGRAM_TWO = 2;
    static final int PROGRAM_THREE = 3;
    static final int PROGRAM_FOUR = 4;
    static final int PROGRAM_FIVE = 5;
    static final int PROGRAM_SIX = 6;
    static final int PROGRAM_SEVEN = 7;
    static final int PROGRAM_EIGHT = 8;
    static final int PROGRAM_NINE = 9;
    static final int PROGRAM_TEN = 10;

    static double HEAD_PERCENTAGE = 0;
    static double TAIL_PERCENTAGE = 0;

    public static void main(String[] args) {

        int tempVarForChoice = 0;

        System.out.println("Welcome to the section of Basic core programs");
        System.out.println("Enter a number between 1 to 10 to run any one of the program");
        Scanner choice = new Scanner(System.in);
        int choiceOfUsers = choice.nextInt();

        while ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
            System.out.println("Please Enter a number between 1 to 10 Only");
            choiceOfUsers = choice.nextInt();
        }

        switch (choiceOfUsers) {
            case PROGRAM_ONE:
                System.out.println("1. Program is to flip the coin");
                functionOneCoinFlip();
                System.out.println("percentage of Head is " + HEAD_PERCENTAGE + " 1%");
                System.out.println("percentage of Tail is " + TAIL_PERCENTAGE + " %");
        }
    }

    static void functionOneCoinFlip() {

        int headCount = 0;
        int tailCount = 0;

        System.out.println("Enter How many times you want to flip the coin");
        Scanner inputForCoinFlip = new Scanner(System.in);
        int totalTimesFlip = inputForCoinFlip.nextInt();

        while (totalTimesFlip < 0) {
            System.out.println("Please enter a positive number");
            totalTimesFlip = inputForCoinFlip.nextInt();
        }

        for (int index = 0; index < totalTimesFlip; index++) {
            double flipRandom = Math.random() % 2;
            if (flipRandom < 0.5)
                tailCount++;
            else
                headCount++;
        }

        TAIL_PERCENTAGE = (double) tailCount / totalTimesFlip * 100;
        HEAD_PERCENTAGE = (double) headCount / totalTimesFlip * 100;
    }
}