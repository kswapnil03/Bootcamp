package collections;

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

    stack(int max) {
//        System.out.println("CTR");
        this.max = max;
        this.top = 0;

        list1 = new ArrayList<Integer>();
        mini = new ArrayList<Integer>();


    }

    public Boolean is_full() {
        if (list1.isEmpty() == true) return false;
        if (max == list1.size())

            return true;
        else
            return false;
    }

    public Boolean is_empty() {
        return list1.isEmpty();
    }

    public void push(int n)

    {
        if (is_full()) {
            System.out.println("collections.stack is full");

        } else {
//            System.out.println("check");

            this.list1.add(n);
            if (top == 0) {
                this.mini.add(n);
            } else {
                if (n < this.mini.get(mini.size() - 1))
                    this.mini.add(n);
                else
                    this.mini.add(this.mini.get(mini.size() - 1));
            }


        }
        top++;
    }

    public int pop() throws MyException {


        if (top > 0) {
//            System.out.println(top - 1);
            int t = list1.remove(top - 1);
            mini.remove(top - 1);
            top--;
            return t;

        } else {
            throw new MyException("collections.stack is empty");
        }
    }

    public int getmin() throws MyException {

        if (top != 0)
            return this.mini.get(top - 1);
        else
            throw new MyException("no value");
    }


}

class q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("enter max size");
        size = sc.nextInt();
        stack st = new stack(size);
//        System.out.println("Swapnlin");
        st.push(5);
        st.push(3);
        st.push(2);
        st.push(4);


        try {
            System.out.println("min element is - " + st.getmin());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        try {
            st.pop();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }


    }
}
