package corejavapractice;

// Declare one Instance and one Static veriable
public class DecOneInsQ3 {
    int a = 20;
    static int b = 30;

    // Main method
    public static void main(String[] args) {
        System.out.println(b);
        DecOneInsQ3 vin3 = new DecOneInsQ3();
        vin3.data3();
        data4();

    }

    //  Instance method
    public void data3() {
        System.out.println(a + b);
    }

    // static method
    public static void data4() {
        DecOneInsQ3 vin1 = new DecOneInsQ3();
        System.out.println(vin1.a * b);
    }
}



