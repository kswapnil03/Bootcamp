package Q4;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Service {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Deprecated
    public void depMethod(){
        System.out.println("this is depricated method");
    }
}
