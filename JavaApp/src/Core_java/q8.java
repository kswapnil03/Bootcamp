package Core_java;

public class q8 {
    public static void main(String args[]) {
        String str = "hello swapnil";
        System.out.println("String is :" + str);
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        System.out.println("reversed String is :" + buffer);
        buffer.delete(4, 9);
        System.out.println("String after deletion :" + buffer);


    }
}
