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

        System.out.println("Welcome to the section of Basic core programs");
        System.out.println("Below is the list of all 10 Programs ");
        System.out.println("Enter a number between 1 to 10 to run any one of the program");
        functionDisplayChoices();
        System.out.println("Your choices : ");
        Scanner choice = new Scanner(System.in);
        int choiceOfUsers = choice.nextInt();

        while ((choiceOfUsers < 0 || choiceOfUsers > 11)) {
            System.out.println("Please Enter a number between 1 to 10 Only and Enter 11 to terminate from here");
            //display all choices
            choiceOfUsers = choice.nextInt();
        }
        while (choiceOfUsers > 0) {

            switch (choiceOfUsers) {
                case PROGRAM_ONE:
                    System.out.println("1. Program is to flip the coin");
                    functionOneCoinFlip();
                    System.out.println("percentage of Head is " + HEAD_PERCENTAGE + " 1%");
                    System.out.println("percentage of Tail is " + TAIL_PERCENTAGE + " %");

                    System.out.println(" \t Do you want to Run any other program If yes Please press that number and to terminate program, enter any number other than 0 to 10");
                    choiceOfUsers = choice.nextInt();

                    while ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case PROGRAM_TWO:
                    System.out.println("2. Leap year program ");
                    functionTwoLeapYear();
                    System.out.println(" \t Do you want to Run any other program If yes Please press that number and to terminate program, enter any number other than 0 to 10");
                    choiceOfUsers = choice.nextInt();
                    while ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case PROGRAM_THREE:
                    System.out.println("3. Power of 2 program");
                    functionThreePowerOfTwo();
                    System.out.println(" \t Do you want to Run any other program If yes Please press that number and to terminate program, enter any number other than 0 to 10");
                    choiceOfUsers = choice.nextInt();
                    while ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case PROGRAM_FOUR:
                    System.out.println("4. Harmonic Number program");
                    float harmonicNumber = functionHarmonicNUmber();
                    System.out.println("Harmonic value : " + harmonicNumber);
                    System.out.println(" \t Do you want to Run any other program If yes Please press that number and to terminate program, enter any number other than 0 to 10");
                    choiceOfUsers = choice.nextInt();
                    while ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                    break;
                case PROGRAM_FIVE:
                    break;
                case PROGRAM_SIX:
                    System.out.println("6. Program to compute Quotient and Remainder ");
                    functionQuotientRemainder();

                case PROGRAM_SEVEN:
                    System.out.println("7. Program to swap two number ");
                    functionSwappingNumber();
                    System.out.println(" \t Do you want to Run any other program If yes Please press that number and to terminate program, enter any number other than 0 to 10");
                    choiceOfUsers = choice.nextInt();
                    while ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                case PROGRAM_EIGHT:
                    System.out.println("8. Program to swap two number ");
                    int returnedNumber = functionIsEvenOdd();
                    if (returnedNumber == 0)
                        System.out.println("Number is even");
                    else
                        System.out.println("Number is odd");
                    System.out.println(" \t Do you want to Run any other program If yes Please press that number and to terminate program, enter any number other than 0 to 10");
                    choiceOfUsers = choice.nextInt();
                    while ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                case PROGRAM_NINE:
                    System.out.println("9. Program to check Vowel or Consonant ");
                    functionConsonantVowel();
                    System.out.println(" \t Do you want to Run any other program If yes Please press that number and to terminate program, enter any number other than 0 to 10");
                    choiceOfUsers = choice.nextInt();
                    while ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }

                case PROGRAM_TEN:
                    System.out.println("10. Program to find the largest among three numbers");

                    System.out.println("Largest of three is : " + functionLargestAmongThree());///

                    System.out.println(" \t Do you want to Run any other program If yes Please press that number and to terminate program, enter any number other than 0 to 10");
                    choiceOfUsers = choice.nextInt();
                    while ((choiceOfUsers < 0 || choiceOfUsers > 10)) {
                        System.out.println("Program Terminated");
                        return;
                    }
                case 11:
                    System.out.println("your program is terminated");
                    return;
            }
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

    static void functionTwoLeapYear() {
        System.out.println("Enter a Year to check that year is Leap year or not");
        Scanner inputForYear = new Scanner(System.in);

        int inputYear = inputForYear.nextInt();
        while (!((inputYear > 1000) && (inputYear < 10000))) {
            System.out.println("Please Enter a four digit number");
            inputYear = inputForYear.nextInt();
        }

        if ((inputYear % 4 == 0) || (inputYear % 100 == 0 && inputYear % 400 == 0))
            System.out.println("Input Year " + inputYear + " is a Leap year");
        else
            System.out.println("Input Year " + inputYear + " is not a Leap year");
    }

    static void functionThreePowerOfTwo() {
        Scanner inputForN = new Scanner(System.in);
        System.out.println("Please enter a number to print power of 2");
        int number = inputForN.nextInt();
        while (!(number >= 0 && number < 31)) {
            System.out.println("This will cause Integer overflow. Please Enter number between 0 to 31 ");
            number = inputForN.nextInt();
        }
        for (int index = 0; index <= number; index++) {
            int answer = (int) Math.pow(2, index);
            System.out.println("2 ^ " + index + " = " + answer);
        }
    }

    static void functionQuotientRemainder() {
        float divisor, dividend, quotient, remainder;
        Scanner forInputs = new Scanner(System.in);
        System.out.println("Please enter a Dividend");
        dividend = forInputs.nextFloat();
        System.out.println("Please enter a Divisor");
        divisor = forInputs.nextFloat();

        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("Quotient is : " + quotient);
        System.out.println("Remainder is : " + remainder);
    }

    static void functionSwappingNumber() {
        int number1, number2;
        Scanner toInputNumbers = new Scanner(System.in);
        System.out.println("Please enter a 1st number");
        number1 = toInputNumbers.nextInt();

        System.out.println("Please enter a 2nd number");
        number2 = toInputNumbers.nextInt();

        System.out.println("Numbers before swapping : " + number1 + " " + number2);
        number2 = number1 + number2;
        number1 = number2 - number1;
        number2 = number2 - number1;
        System.out.println("Number after swapping : " + number1 + " " + number2);
    }

    static int functionIsEvenOdd() {
        System.out.println("Enter the number to check Even or odd");
        Scanner takeInput = new Scanner(System.in);
        int number = takeInput.nextInt();
        return number % 2;
    }

    static int functionLargestAmongThree() {
        int number1, number2, number3, maxOfAllThree, tempVarForStoring;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the 1st number");
        number1 = sc.nextInt();

        System.out.println("Please Enter the 2nd number");
        number2 = sc.nextInt();

        System.out.println("Please Enter the 3rd number");
        number3 = sc.nextInt();

        tempVarForStoring = (number1 > number2) ? number1 : number2;
        maxOfAllThree = (tempVarForStoring > number3) ? tempVarForStoring : number3;
        return maxOfAllThree;
    }

    static void functionConsonantVowel() {
        boolean isVowel = false;
        System.out.println("Enter an Alphabet to check whether it is Vowel or Consonant");

        Scanner takingChar = new Scanner(System.in);

        char singleCharInput = takingChar.next().charAt(0);
        char capitalAlphabet = Character.toUpperCase(singleCharInput);

        switch (capitalAlphabet) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel = true;
        }

        if (isVowel == true)
            System.out.println("Alphabet is Vowel");
        else if (capitalAlphabet > 'A' && capitalAlphabet < 'Z')
            System.out.println("Alphabet is Consonant");
        else
            System.out.println("Please Enter an Alphabet");
    }

    static float functionHarmonicNUmber(){
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Please enter a number to find out the N-th Harmonic");
        int numberN= takeInput.nextInt();
        float harmonic = 1;
        for (int index = 2; index <= numberN; index++) {
            harmonic += (float)1/index;
        }
        return harmonic;
    }

    static void functionDisplayChoices() {
        System.out.println("1. Flip coin and print percentage program ");
        System.out.println("2. Leap Year Program ");
        System.out.println("3. Power of 2 table program ");
        System.out.println("4. Harmonic Number Program");
        System.out.println("5. Prime Factors program");
        System.out.println("6. Compute Quotient and Remainder");
        System.out.println("7. Swap two numbers program ");
        System.out.println("8. Even or Odd Program ");
        System.out.println("9. Alphabet is Vowel or Consonant Program ");
        System.out.println("10. Largest among three Numbers Program ");
    }

    static void functionToDisplayOverCases(){
        System.out.println("Below is the list of all 10 Programs ");
        System.out.println("Enter a number between 1 to 10 to run any one of the program and any other number to terminate");
        functionDisplayChoices();
        System.out.println("Your choices : ");
    }
}