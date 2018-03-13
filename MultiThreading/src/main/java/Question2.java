import java.lang.*;
import java.io.*;
import java.util.*;
class Prime extends Thread
{
    public void run()
    { int p=0;
        try
        {
            for(int i=3;i<=20;i++)
            {
                for(int j=2;j<i;j++)
                {
                    if (i % j != 0)
                    {
                        p = 1;

                    } else
                    {
                        p = 0;
                        break;
                    }
                }
                if(p==1)
                    System.out.println ("Prime No.= "+i);
                Thread.sleep(500);
            }
        }
        catch (Exception e){}
    }
}
class notPrime extends Thread
{
    public void run()
    { int p=0;
        try
        {
            for(int i=3;i<=20;i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j != 0) {
                        p = 1;
                    } else {
                        p = 0;
                        break;
                    }
                }
                if (p == 0)
                    System.out.println("Non-Prime No.= " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

}

class Question2
{
    public static void main(String args[]) throws InterruptedException {
        new Prime().start();
        new notPrime().start();


    }
}
