package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q2 {

    public static int calculate(String s) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (m.get(s.charAt(i)) == null)
                m.put(s.charAt(i), 1);
            else {
                m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
            }

        }
        return m.size();
    }

    public static void main(String[] args) {

        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        s = sc.nextLine();
        System.out.println("Number of Unique Characters are=" + calculate(s));
    }
}
