package Java8;

import java.util.Scanner;

@FunctionalInterface
interface Drawable {
    public void draw();
}

public class table {
    public static void main(String[] args) {
        int width;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of which table should be printed");
        width = sc.nextInt();


        Drawable d2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(width * i);
            }
        };
        d2.draw();
    }
}