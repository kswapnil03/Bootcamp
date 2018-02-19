package Core_java;

import java.io.*;

public class q9 {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("/home/swapnil/abc.text");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            StringBuilder str = new StringBuilder();
            while ((line = br.readLine()) != null) {
                str.append(line);
            }

            System.out.println("content in file is " + str);

        } catch (FileNotFoundException ex) {
            System.out.println("ex" + ex);
        } catch (IOException ex1) {

        }
    }
}