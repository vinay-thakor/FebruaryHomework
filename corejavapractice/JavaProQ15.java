package corejavapractice;

import java.util.Scanner;

public class JavaProQ15 {

    //Java program to swap two variables


    public static void main(String args[]) {
        int x, y, t;
        System.out.println("Enter One numbers (x)");
        System.out.println("Enter two numbers (y)");

        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before Swapping\nx = " + x + "\ny = " + y);

        t = x;
        x = y;
        y = t;

        System.out.println("After Swapping\nx = " + x + "\ny = " + y);
    }
}



