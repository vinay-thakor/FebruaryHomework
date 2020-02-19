package corejavapractice;

import java.util.Scanner;
//5.	A program for a calculator with addition, subtraction, multiplication
//     and division methods all with parameters and use string concatenation methods.


public class JavaProQ5 {


    //Declare Main Method
    public static void main(String[]args) {
        int first, second, addition, subtract, multiply;
        float devide;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Numbers : ");
        first = scanner.nextInt();
        System.out.print("Enter Second Numbers : ");
        second = scanner.nextInt();

        addition = first + second;
        subtract = first - second;
        multiply = first * second;
        devide = (float) first / second;

        System.out.println("Sum = " + addition);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + devide);
    }
}
