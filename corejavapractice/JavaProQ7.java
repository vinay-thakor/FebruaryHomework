package corejavapractice;

import java.util.Scanner;

public class JavaProQ7 {


    //  Convert To Celsius

    //Declare Main Method
    public static void main(String[] args) {
        float temperature;
        Scanner tem = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit");
        temperature = tem.nextInt();

        temperature = ((temperature - 32) * 5) / 9;

        System.out.println("temperature in Celsius = " + temperature);
    }
}




