package Java8;

public class def_stat {
    public static void main(String[] args) {
        func Func = () -> {
            System.out.println("hello i am main");
        };
        Func.print();
        Func.printme();
        func.printme2();
    }

    @FunctionalInterface
    interface func {
        void print();

        default void printme() {
            System.out.println("hello I am default");
        }

        static void printme2() {
            System.out.println("hello I am static");
        }


    }
}
