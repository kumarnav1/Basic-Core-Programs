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
    static final int TERMINATION = 11;

    public static void main(String[] args) {

        System.out.println("Welcome to the section of Basic core programs");
        AllPrograms refVar = new AllPrograms();
        refVar.functionDisplayChoices();
        System.out.print("Your choices : ");
        Scanner choice = new Scanner(System.in);
        int choiceOfUsers = choice.nextInt();

        while ((choiceOfUsers <= 0 || choiceOfUsers > TERMINATION)) {
            System.out.println("Please Enter a number between 1 to 10 Only and Enter 11 to terminate from here");
            choiceOfUsers = choice.nextInt();
        }

        while (choiceOfUsers > 0) {
            switch (choiceOfUsers) {
                case PROGRAM_ONE:
                    System.out.println("1. Program is to flip the coin");
                    refVar.functionCoinFlip();
                    refVar.functionToDisplayOverCases();
                    choiceOfUsers = choice.nextInt();
                    if ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case PROGRAM_TWO:
                    System.out.println("2. Leap year program ");
                    refVar.functionTwoLeapYear();
                    refVar.functionToDisplayOverCases();
                    choiceOfUsers = choice.nextInt();
                    if ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case PROGRAM_THREE:
                    System.out.println("3. Power of 2 program");
                    int number = Integer.parseInt(args[0]);
                    refVar.functionPowerOfTwo(number);
                    refVar.functionToDisplayOverCases();
                    choiceOfUsers = choice.nextInt();
                    if ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case PROGRAM_FOUR:
                    System.out.println("4. Harmonic Number program");
                    float harmonicNumber = refVar.functionHarmonicNUmber();
                    System.out.println("Harmonic value : " + harmonicNumber);
                    refVar.functionToDisplayOverCases();
                    choiceOfUsers = choice.nextInt();
                    if ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case PROGRAM_FIVE:
                    System.out.println("5. Print the prime factors");
                    refVar.functionPrimeFactors();
                    refVar.functionToDisplayOverCases();
                    choiceOfUsers = choice.nextInt();
                    if ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case PROGRAM_SIX:
                    System.out.println("6. Program to compute Quotient and Remainder ");
                    refVar.functionQuotientRemainder();
                    refVar.functionToDisplayOverCases();
                    choiceOfUsers = choice.nextInt();
                    if ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case PROGRAM_SEVEN:
                    System.out.println("7. Program to swap two number ");
                    refVar.functionSwappingNumber();
                    refVar.functionToDisplayOverCases();
                    choiceOfUsers = choice.nextInt();
                    if ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case PROGRAM_EIGHT:
                    System.out.println("8. Check whether a number is even or odd. ");
                    int returnedNumber = refVar.functionIsEvenOdd();
                    if (returnedNumber == 0)
                        System.out.println("Number is even");
                    else
                        System.out.println("Number is odd");
                    refVar.functionToDisplayOverCases();
                    choiceOfUsers = choice.nextInt();
                    if ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case PROGRAM_NINE:
                    System.out.println("9. Program to check Vowel or Consonant ");
                    refVar.functionConsonantVowel();
                    refVar.functionToDisplayOverCases();
                    choiceOfUsers = choice.nextInt();
                    if ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case PROGRAM_TEN:
                    System.out.println("10. Program to find the largest among three numbers");
                    System.out.println("Largest of three is : " + refVar.functionLargestAmongThree());
                    refVar.functionToDisplayOverCases();
                    choiceOfUsers = choice.nextInt();
                    if ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
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