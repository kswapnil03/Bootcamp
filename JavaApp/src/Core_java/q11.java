package Core_java;

public class q11 {
    public static void add(int num1, int num2) {
        System.out.println("Result :" + (num1 + num2));
    }

    public static void add(double num1, double num2) {
        System.out.println("Result : " + (num1 + num2));
    }

    public static void multiply(float num1, float num2) {
        System.out.println("Result :" + num1 * num2);
    }

    public static void multiply(int num1, int num2) {
        System.out.println("Result :" + num1 * num2);
    }

    public static void concat_strings(String str1, String str2) {
        System.out.println("Result :" + str1 + str2);
    }


    public static void main(String[] args) {
        System.out.println("adding two integers 50,60");
        add(50, 60);
        System.out.println("adding two double 12.0000000, 168.000000");
        add(12.0000000, 168.000000);
        System.out.println("multiplying two float 10.0085F, 15.0000F");
        multiply(10.0085F, 15.0000F);
        System.out.println("multiplying two int 10,8");
        multiply(10, 8);
        System.out.println("concat string swapnil and khanna");
        concat_strings("swapnil", "khanna");

    }
}
