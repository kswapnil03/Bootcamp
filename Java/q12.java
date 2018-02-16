
class Bank {

    String city;
    double rate_of_interest;

    public void getDetails(){
        city="delhi";
        rate_of_interest=12.5;
    }

    public void display(){
        System.out.println("Main Bank's City :"+city+" and interest : "+rate_of_interest);
    }
}


class SBI extends Bank{

    public void getDetails(){

        rate_of_interest=9.5;
    }

    public void display(){
        System.out.println("SBI interest : "+rate_of_interest);
    }

}


class BOI extends Bank{

    public void getDetails(){
        rate_of_interest=10.50;
    }

    public void display(){
        System.out.println("BOI interest : "+rate_of_interest);
    }
}

class ICICI extends Bank{
    public void getDetails(){
        rate_of_interest=8.5;
    }



    public void display(){
        System.out.println("ICICI interest : "+rate_of_interest);
    }
}

public class q12 {

    public static void main(String[] args) {

        Bank obj=new Bank();
        obj.getDetails();
        obj.display();

        obj=new SBI();
        obj.getDetails();
        obj.display();

        obj=new BOI();
        obj.getDetails();
        obj.display();

        obj=new ICICI();
        obj.getDetails();
        obj.display();


    }
}