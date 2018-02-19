

public class q3
 {

    public static void count_no_of_occurence_of_a_character(String str,String ch ){

        int count=str.length()-str.replace(ch,"").length();

        System.out.println(count);

    }

    public static void main(String[] args) {
        count_no_of_occurence_of_a_character("swapnil khanna","a");
    }
}
