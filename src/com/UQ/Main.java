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

            System.out.println("F(" + nTh + ") is: " + fib(nTh) + "\n");

        }
    }

    public static int fib(int n) {

        int fibVal = (n-1)+(n-2);
        double Phi = ((1 + Math.sqrt(5))/2);
        double phi = ((1 - Math.sqrt(5))/2);


        double fibN = (Math.pow(Phi, n) - Math.pow(phi, n)) / Math.sqrt(5);

        return((int)fibN);
    }

}
