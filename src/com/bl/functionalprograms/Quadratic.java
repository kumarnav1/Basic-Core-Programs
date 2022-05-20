package com.bl.functionalprograms;

public class Quadratic {

    public static void main(String[] args) {

        float delta, root1, root2;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println("Numerical coefficients are \t a = " + a + "\t b = " + b + "\t c = " + c);

        delta = (b * b) - (4 * a * c);
        root1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
        root2 = (float) (-b - Math.sqrt(delta)) / (2 * a);

        if (!(delta > 0)) {
            System.out.println("Roots are not real.\n Try again for another values of a, b, c");
            return;
        }
        System.out.println("First Root of x :  " + root1 + "\nSecond Root of x :  " + root2);
    }
}