

import java.net.SocketOption;
import java.util.Scanner;
import java.util.*;
public class q2 {


    public static void main(String[] args) {

        System.out.print("Enter string to analyse:");
    String arr[]= new String[1000];

        Scanner sn = new Scanner(System.in);
        String input = sn.nextLine();


        String[] words = input.split(" ");
        for (int i=0;i<words.length;i++)
        {
            int c=1; 
            for(int j=i+1;j<words.length;j++) {

                if(words[i].equals(words[j])) {

                 words[j]="ghj";
                 c = c + 1; 
                }
            }
            if(words[i]!="ghj" &&c>1)
            System.out.println(words[i]+" "+c);

        }
    }
}
