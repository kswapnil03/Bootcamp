public class q7 {

    static int age;
    static String fname;
    static String lname;

    static {
        age = 22;
        fname = "swapnil";
        lname = "khanna";
    }

    static void p(int age, String fname, String lname) {
        System.out.println(fname + " " + lname + " age " + age);
    }

    public static void main(String args[]) {

        q7 a = new q7();
        a.p(age, fname, lname);
    }
}
