package Question2;

public class Audience implements Viewer {

    Integer runs;
    Float overs;
    Float runrate;
    Integer wickets;

    Cricket cricket;

    public Audience(Cricket cricket) {
        this.cricket = cricket;
        cricket.registerviewer(this);
    }

    @Override
    public String toString() {
        return "Audience{" +
                "runs=" + runs +
                ", overs=" + overs +
                ", runrate=" + runrate +
                ", wickets=" + wickets +
                ", cricket=" + cricket +
                '}';
    }

    @Override
    public void update(Integer runs, Float overs, Float runrate, Integer wickets) {
        this.runs=runs;
        this.overs=overs;
        this.runrate=runrate;
        this.wickets=wickets;

        System.out.println("audience updated "+ this);
    }
}