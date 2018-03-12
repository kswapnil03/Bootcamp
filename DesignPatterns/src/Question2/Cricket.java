package Question2;

import java.util.List;

public interface Cricket {

    public void setRunrate();
    public void registerviewer(Viewer viewer);
    public void  detachviewer(Viewer viewer);
    public void notifyall();
}