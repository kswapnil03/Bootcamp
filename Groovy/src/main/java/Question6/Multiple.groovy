package Question6;

public class Multiple {
    public static void main(String[] args) {
        println("first way")
        for (int i = 1; i <= 10; i++) {
            print "${3 * i} "
        }
        println()
        println("second way")
        10.times {
            print "${(it + 1) * 3} "
        }
        println()
        println("third way")
        int i = 0
        10.times {
            i=i+3
            print "${i} "
        }
    }
}
