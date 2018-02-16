public class q8 {
    public static void main(String args[])
    {
        String str="hello swapnil";
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        System.out.println(buffer);
        buffer.delete(4, 9);
        System.out.println(buffer);

    }
}
