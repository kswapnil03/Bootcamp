package Core_java;

public class q4 {

    public static void calculate(String str) {

        int lower_count = 0;
        int upper_count = 0;
        int special_count = 0;
        int digit_count = 0;
        for (char c : str.toCharArray()) {

            if (Character.isLowerCase(c)) {
                lower_count++;
            } else if (Character.isUpperCase(c)) {
                upper_count++;
            } else if (Character.isDigit(c)) {
                digit_count++;
            } else {
                special_count++;
            }

        }


        System.out.println("Number of lower case character :" + lower_count);
        System.out.println("Number of upper case character :" + upper_count);
        System.out.println("Number of digit :" + digit_count);
        System.out.println("Number of special case character :" + special_count);

        System.out.println("Percent of lower case character :" + lower_count * 100 / str.length());
        System.out.println("percent of upper case character :" + upper_count * 100 / str.length());
        System.out.println("percent of digit :" + digit_count * 100 / str.length());
        System.out.println("percent of special case character :" + special_count * 100 / str.length());


    }

    public static void main(String[] args) {
        System.out.println("Entered String is=AbcDT^123*&$%");

        calculate("AbcDT^123*&$%");
    }
}
