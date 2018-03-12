package Question1;

public class Topping1 extends Toppings {
    Dominos dominos;

    public Topping1(Dominos dominos) {
        this.dominos = dominos;
    }

    @Override
    public String getinfo() {
    return  ("toppings 1"+dominos.getinfo());
    }

    @Override
    public int cost() {
        return 10 + dominos.cost();
    }
}
