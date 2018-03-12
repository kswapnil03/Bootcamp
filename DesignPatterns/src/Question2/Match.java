package Question2;

import java.util.ArrayList;
import java.util.List;

public class Match implements Cricket {

    Integer runs;
    Float overs;
    Float runrate;
    Integer wickets;
    List<Viewer> viewers = new ArrayList<>();

    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public Float getOvers() {
        return overs;
    }

    public void setOvers(Float overs) {
        this.overs = overs;
    }

    public Float getRunrate() {
        return runrate;
    }

    @Override
    public void setRunrate() {
        this.runrate= this.runs/this.overs;
    }

    public Integer getWickets() {
        return wickets;
    }

    public void setWickets(Integer wickets) {
        this.wickets = wickets;
    }

    public List<Viewer> getViewers() {
        return viewers;
    }

    public void setViewers(List<Viewer> viewers) {
        this.viewers = viewers;
    }

    @Override
    public void registerviewer(Viewer viewer) {
        this.getViewers().add(viewer);

    }

    @Override
    public void detachviewer(Viewer viewer) {
        Integer i= viewers.indexOf(viewer);
        if(i>=0)
            viewers.remove(i);

    }

    @Override
    public void notifyall() {
        for (Viewer i: viewers){
            i.update(runs,overs,runrate,wickets);
        }

    }
}