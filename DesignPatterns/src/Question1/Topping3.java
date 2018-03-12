package Question1;

public class Topping3 extends Toppings {
    Dominos dominos;

    public Topping3(Dominos dominos) {
        this.dominos = dominos;
    }

    @Override
    public String getinfo() {
    return ("Toppings3"+dominos.getinfo());
    }

    @Override
    public int cost() {
        return 30 + dominos.cost();
    }
}
