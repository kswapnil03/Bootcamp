
import java.io.*;
public class q9 {

    public static void main(String[] args){

        try {
            FileReader fr = new FileReader("/home/abc.txt");
            BufferedReader br =new BufferedReader(fr); // object of BufferedReader is used to read a line from a file.
            String line="";
            StringBuilder str=new StringBuilder();
            while((line=br.readLine())!=null){
                str.append(line);
            }

            System.out.println("sum of the no is ": str);

        }
        catch (FileNotFoundException ex){
            System.out.println("ex"+ex);
        }
        catch (IOException ex1){

        }
    }
}