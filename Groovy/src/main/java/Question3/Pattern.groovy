package Question3

class Pattern {
    public static void main(String[] args) {
        for (int i=1;i<=8;i=i*2){
            i.times {printf "*"}
            println()
        }
    }
}
