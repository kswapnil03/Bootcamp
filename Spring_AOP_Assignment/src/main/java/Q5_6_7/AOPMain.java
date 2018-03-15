package Q5_6_7;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class AOPMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring_config5.xml");


        Service service=applicationContext.getBean(Service.class);
        service.setId(15);


        System.out.println("..................................");
        try {
            service.checkId();
        }
        catch (IOException e){
            System.out.println(e.toString());
        }


    }
}
