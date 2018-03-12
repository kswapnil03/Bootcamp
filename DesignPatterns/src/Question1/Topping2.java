package Question1;

public class Topping2 extends Toppings {
    Dominos dominos;

    public Topping2(Dominos dominos) {
        this.dominos = dominos;
    }

    @Override
    public String getinfo() {
     return  ("Topping2" +dominos.getinfo());
    }

    @Override
    public int cost() {
        return 20 + dominos.cost();
    }
}
