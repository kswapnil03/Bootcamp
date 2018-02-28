import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;
import java.util.*;
class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }
}
class stack {
    int top;



    static int max;
    List<Integer> list1;
    List<Integer> mini;

    stack(int max)
    {
        this.max=max;
        this.top=0;

        List<Integer> list1=new ArrayList<Integer>();
        List<Integer> mini=new ArrayList<Integer>();


    }
    public Boolean is_full()
    {
        if(max==list1.size())

            return true;
        else
            return false;
    }
    public Boolean is_empty()
    {
        if(list1.size()==0)
            return true;
        else
            return false;
    }
    public void push(int n)

    {
        if(is_full())
        {
            System.out.println("stack is full");

        }
        else
        {

            this.list1.add(n);
            if(top==0) {
                this.mini.add(n);
            }
            else{
                if(n<this.mini.get(mini.size()-1))
                    this.mini.add(n);
                else
                    this.mini.add(this.mini.get(mini.size()-1));
            }


        }
    }

    public int pop() throws MyException {


        if (top != 0) {
            int t = list1.remove(top);
            mini.remove(top);
            top--;
            return t;

        } else {
            throw new MyException("stack is empty");
        }
    }
    public int getmin() throws MyException
    {

        if (top!=0)
            return this.mini.get(top-1);
        else
            throw new MyException("no value");
    }


}
class q7
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter max size");
        size=sc.nextInt();
        stack st=new st(size);
        st.push(5);
        st.push(3);
        st.push(2);
        st.push(4);
        st.push(1);

        try{
            System.out.println("min element is-" + st.getmin());
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
        try{
            st.pop();
        }catch(MyException e)
        {
            System.out.println(e.getMessage());
        }






    }
}