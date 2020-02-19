package corejavapractice;

public class DecTwoInsQ4 {
    // Declare two instance variable outside main method
    int a = 10;
    int b = 5;

    // Declare two static variable outside main method
    static int c = 3;
    static int d = 1;

    // Declare Main mathod
    public static void main(String[] args) {
        DecTwoInsQ4 vin1 = new DecTwoInsQ4();
        vin1.instancemethod1();
        staticmethod1();

        // Calling both method
    }

    // Declare Instance mathod
    public void instancemethod1() {
        System.out.println(a + b + c + d);
    }

    // Declare Static method
    public static void staticmethod1() {
        // Create object to call Instance variable
        DecTwoInsQ4 vin2 = new DecTwoInsQ4();
        System.out.println(vin2.a - vin2.b - c - d);

    }


}