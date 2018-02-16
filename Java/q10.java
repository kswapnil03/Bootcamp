public class q10
{
    public enum houses {
        House1(10), House2(15), House(7);
        public final int price;

        houses(int price) {
            this.price = price;
        }

        int getPrice() {
            return this.price;
        }
    }


    public static void main(String[] args) {
        for (houses h:houses.values()){
            System.out.println("house name : "+h+" and house price : "+h.getPrice());
        }
    }
}
