package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Question1 {
    static Scanner sc = new Scanner(System.in);

    public static void answer() {
        ArrayList<Float> list = new ArrayList<>();
        System.out.println("enter five float values");
        for (int i = 0; i < 5; i++) {

            Float x = sc.nextFloat();
            list.add(x);
        }
        Float sum = 0.0f;

        Iterator<Float> it = list.iterator();
        while (it.hasNext()) {

            sum += it.next();
        }
        System.out.println("Sum is=" + sum);
    }

    public static void main(String[] args) {
        Question1 q = new Question1();
        q.answer();


    }
}
