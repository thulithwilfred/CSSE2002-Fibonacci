package com.UQ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner usrIn = new Scanner(System.in);
        int fibN;
        System.out.println("Ah so you want to do the Fibonacci?");

        while (true) {

            System.out.println("Enter the f(n), n:");

            if (!usrIn.hasNextInt()) {
                System.out.println("Invalid Input, Enter Ints Only");
                continue;
            }

            int nTh = usrIn.nextInt();

            /* Use Either Of the below, they use different approaches */
            System.out.println("F(" + nTh + ") is: " + fib(nTh) + "\n");

            //System.out.println("F(" + nTh + ") is: " + fibRec(nTh - 1 ) + "\n");

        }
    }

    public static int fibRec(int n) {
    /* Implemented using recursion, increased time complexity */
        if (n < 2) {
            return 1;
        }
        return fibRec(n - 1) + fibRec(n - 2);
    }

    public static int fib(int n) {
        /* Implemented using equation */
        int fibVal = (n-1)+(n-2);
        double Phi = ((1 + Math.sqrt(5))/2);
        double phi = ((1 - Math.sqrt(5))/2);


        double fibN = (Math.pow(Phi, n) - Math.pow(phi, n)) / Math.sqrt(5);

        return((int)fibN);
    }

}
