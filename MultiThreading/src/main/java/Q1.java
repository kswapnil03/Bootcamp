public class Q1 {

    public static void main(String[] args) {

        Thread t = new Thread(() -> printEven());
        Thread t1=new Thread(()-> printOdd());
        t.start();
        t1.start();


    }

    public static void printEven() {
        for (int i = 0; i <= 10; i = i + 2) {

            System.out.println("Even : " + i);
        }
    }

    public static void printOdd() {
        for (int i = 1; i <= 9; i = i + 2) {
            System.out.println("Odd : " + i);

        }
    }


}

