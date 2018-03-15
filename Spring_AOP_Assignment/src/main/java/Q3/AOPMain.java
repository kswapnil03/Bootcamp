package Q3;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class AOPMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring_config3.xml");
        Service service=applicationContext.getBean(Service.class);

        service.setId(15);
        try {
            service.checkId();
        }
        catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
}
