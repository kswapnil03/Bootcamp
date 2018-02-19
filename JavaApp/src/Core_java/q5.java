package Core_java;

import java.util.*;

public class q5 {

    public static void main(String[] args) {
        int arr[] = new int[5];
        int arr2[] = new int[5];
        int arr3[] = new int[5];
        int i, j;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array of size 5");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter second array of size 5");
        for (i = 0; i < arr.length; i++) {

            arr2[i] = sc.nextInt();
        }
//        for (i = 0; i < arr3.length; i++) {
//            System.out.println(" " + arr[i]);
//            System.out.println(" " + arr2[i]);
//        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {

                    arr3[i] = arr[i];

                }
            }
        }
        System.out.println("Common elements are");
        for (i = 0; i < arr3.length; i++) {
            System.out.print(" " + arr3[i]);
        }

    }
}
