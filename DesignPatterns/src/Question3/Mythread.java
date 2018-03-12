package Question3;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Mythread extends Thread {

    public void run() {

        Filereader.getInstance().fun();

    }
}


class check{
    public static void main(String[] args) {
        Mythread thread1=new Mythread();
        thread1.start();
        thread1.setName("thread1");

        Mythread thread2=new Mythread();
        thread2.start();
        thread2.setName("thread2");
    }
}