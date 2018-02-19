package Core_java;

import java.util.*;

public class q6 {
    public static void main(String[] args) {
        int i, j, a = 0;

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an array of size 5 with one unique value");
        for (i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        System.out.println("Value which is unique is");
        for (i = 0; i < arr.length; i++) {
            int c = 1;

            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c = c + 1;
                    arr[j] = 0;
                }


            }
            if (arr[i] != 0 && c == 1)

                System.out.println(arr[i]);
        }

    }
}
