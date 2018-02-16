public class q11
{
    public static void add(int num1,int num2){
        System.out.println("add two int :"+ (num1+num2) );
    }

    public static void add(double num1,double num2){
        System.out.println("add two double : "+(num1+num2));
    }

    public static void multiply(float num1,float num2){
        System.out.println("Multiply two floats :"+num1*num2);
    }

    public static void multiply(int num1,int num2){
        System.out.println("multiply two int :"+num1*num2);
    }

    public static void concat_strings(String str1,String str2){
        System.out.println("cancate two strings"+str1+str2);
    }

    public static void concat_strings(String str1,String str2,String str3){

        System.out.println("cancate two strings"+str1+str2+str3);

    }


    public static void main(String[] args) {
        add(50,60);
        add(12.0000000,168.000000);
        multiply(10.0085F,15.0000F);
        multiply(10,8);
        concat_strings("swapnil","khanna");
        concat_strings("abc","def","ghi");
    }
}
