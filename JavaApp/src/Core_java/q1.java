package Core_java;

import java.util.*;

public class q1 {


    public static void main(String args[]) {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String str2 = str.replaceAll("a", "e");
        System.out.println("Replaced String :"+str2);

    }
}

