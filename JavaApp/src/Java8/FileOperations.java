package Java8;

import java.io.File;

import java.io.*;

public class FileOperations {
    public static void main(String[] args) throws IOException{

        InputStream is = null; OutputStream os = null;
        File source= new File("/home/swapnil/abc.text");
        File destination= new File("/home/swapnil/Desktop/filecopy.text");
        System.out.println("file is copied check on location");
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(destination);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = is.read(buf)) > 0) {
                os.write(buf, 0, bytesRead); }
        }
        finally{
            if(is!=null)
                is.close();
            if(os!=null)
                os.close();
        }
    }
}