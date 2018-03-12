package Question1;

public class Application {
    public static void main(String[] args) {
        Dominos dominos=new Pizza1();
        dominos=new Topping1(dominos);
        dominos=new Topping3(dominos);
        System.out.println(dominos.getinfo() +dominos.cost());

        Dominos dominos1=new Pizza2();
        dominos1=new Topping1(dominos1);
        dominos1=new Topping2(dominos1);
        System.out.println(dominos1.getinfo());
        System.out.println(dominos1.cost());

    }
}
