package Question2;

public class Application {
    public static void main(String[] args) {
        Match match= new Match();
        match.setRuns(95);
        match.setWickets(1);
        match.setOvers(15.3f);
        match.setRunrate();

        Audience audience1= new Audience(match);
        Audience audience2= new Audience(match);
        Audience audience3= new Audience(match);

        System.out.println("Before updating audience \n" + audience1 + "\n" + audience2 + "\n" + audience3);

        match.notifyall();

        System.out.println("After updating-");
        System.out.println(audience1);
        System.out.println(audience2);
        System.out.println(audience3);
    }
}